package kodlamaio.hrms.adapters.abstracts;

import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface JobSeekerCheckService {
	boolean checkIfRealPerson(JobSeeker jobSeeker);
}
