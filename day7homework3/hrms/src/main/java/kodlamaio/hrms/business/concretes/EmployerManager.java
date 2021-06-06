package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.adapters.abstracts.EmailVerificationService;
import kodlamaio.hrms.adapters.abstracts.HRMSStaffVerificationService;
import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	@Autowired
	private EmployerDao employerdao;
	
	@Autowired
	private HRMSStaffVerificationService hrmsStaffVerificationService;
	
	@Autowired
	private EmailVerificationService emailVerificationService;
	
	
	

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(employerdao.findAll(), "Iş Verenler Listelendi");
	}

	@Override
	public Result add(Employer employer) {
		
		
		if(employer.getCompanyName().equals("") || employer.getEmail().equals("")
		   || (employer.getTelephone() <= 0) || employer.getPassword().equals("")
		   || employer.getWebsite().equals("")) {
			
			return new ErrorResult("Hiç bir Alan boş bırakılamaz");
		} 
		
		else if(employerdao.existsByEmail(employer.getEmail())) {
			return new ErrorResult("Bu email address başka bir kullanıcı tarafından kullanıkmakta.");
		}
		
		else if(!employer.getPassword().equals(employer.getPasswordRepeat())) {
			return new ErrorResult("Şifre tekrarinizi doğru giriniz, lütfen.");
		} 
		
		else if(emailVerificationService.isEmailVerified(employer.getEmail())) {
			
			if(hrmsStaffVerificationService.isVerifiedEmployerByStaff(employer)) {
				
				this.employerdao.save(employer);
				
				return new SuccessResult("Email addressi Kullanıcı tarafından onaylandı,"
								 + " kullanıcı HRMS çalışanları tarafından onaylandı, Iş Veren eklendi");
			} 
			
			else {
				return new ErrorResult("Kullanıcı HRMS çalışanları tarafından onaylanmadı, kayit başarısız");
			}
			
		}
		
		else {
			return new ErrorResult("Email address'ı Işveren tarafından onaylanmadı, kayt başarısız");
		}
		
	}

}
