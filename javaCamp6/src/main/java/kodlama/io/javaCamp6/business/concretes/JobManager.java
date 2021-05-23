package kodlama.io.javaCamp6.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlama.io.javaCamp6.business.abstracts.JobService;
import kodlama.io.javaCamp6.core.utilities.results.DataResult;
import kodlama.io.javaCamp6.core.utilities.results.Result;
import kodlama.io.javaCamp6.core.utilities.results.SuccessDataResult;
import kodlama.io.javaCamp6.core.utilities.results.SuccessResult;
import kodlama.io.javaCamp6.dataAccess.abstracts.JobDao;
import kodlama.io.javaCamp6.entities.concretes.Job;
@Service
public class JobManager implements JobService {

	//injection
	private JobDao jobDao;
	
	
	@Autowired //bizim yerimize new liyor. Çok önemli
	public JobManager(JobDao jobDao) { //constructor
		super();
		this.jobDao = jobDao;
	}




	@Override
	public DataResult<List<Job>> getAll() {
		return new SuccessDataResult<List<Job>>(this.jobDao.findAll(),"Data listelendi.");
		
	}



	@Override
	public Result add(Job job) {
		this.jobDao.save(job);
		return new SuccessResult("Eklendi.");
	}

	
}
