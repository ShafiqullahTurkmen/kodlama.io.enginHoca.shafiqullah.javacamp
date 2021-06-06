package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.adapters.abstracts.EmailVerificationService;
import kodlamaio.hrms.adapters.abstracts.JobSeekerCheckService;
import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{
	@Autowired
	private JobSeekerDao jobSeekerDao;
	@Autowired
	private JobSeekerCheckService jobSeekerCheckService;
	@Autowired
	private EmailVerificationService emailVerificationService;
	
	
	
	
	

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>
		(this.jobSeekerDao.findAll(), "Iş Arayanlar listelendi");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		
		if(jobSeeker.getFirstName().equals("") || jobSeeker.getLastName().equals("")
		   || jobSeeker.getDateOfBirth().equals("") || jobSeeker.getEmail().equals("") 
		   || jobSeeker.getPassword().equals("") || jobSeeker.getPasswordRepeat().equals("")) {
			return new ErrorResult("Hiç Bir Alan Boş bırkılamaz");
			
		} else if (!jobSeeker.getPasswordRepeat().equals(jobSeeker.getPassword())) {
			return new ErrorResult("Şifre tekrarını doğru giriniz lütfen.");
			
		} else if(jobSeekerCheckService.checkIfRealPerson(jobSeeker)) {
			
			if(this.jobSeekerDao.existsByIdentityNumber(jobSeeker.getIdentityNumber())) {
				return new ErrorResult("Bu TC kimlik numarası başka kullanıcıya ayittir.");
			} 
			else if(this.jobSeekerDao.existsByEmail(jobSeeker.getEmail())) {
				return new ErrorResult("Bu Email address başka birine kullanıcıya ayittir.");
			}
			else if(this.emailVerificationService.isEmailVerified(jobSeeker.getEmail())) {
				this.jobSeekerDao.save(jobSeeker);
			}
			
			return new SuccessResult("Email addressi Kullanıcı tarafından onaylandı, Iş Arayan eklendi ");
			
		} else {
			return new ErrorResult("Invalid person to add");
		}
		
	}

}
