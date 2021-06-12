package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer>{
	List<JobAdvert> getByIsActiveTrue();
	
	List<JobAdvert> findByIsActiveTrueOrderByDeadlineDesc(); 
	List<JobAdvert> findByIsActiveTrueAndEmployer_Id(int id);
	
	JobAdvert findById(int id);
}
