package kodlamaio.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/job_seekers")
public class JobSeekerController {

	private JobSeekerService jobSeekerservice;

	
	
	@Autowired
	public JobSeekerController(JobSeekerService jobSeekerservice) {
		super();
		this.jobSeekerservice = jobSeekerservice;
	}

	@GetMapping("/getAll")
	public DataResult<List<JobSeeker>> getAll() {
		return this.jobSeekerservice.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@Valid @RequestBody JobSeeker jobseeker) {
		return this.jobSeekerservice.add(jobseeker);
	}
	
	
	
}
