package kodlama.io.javaCamp6.business.abstracts;

import java.util.List;

import kodlama.io.javaCamp6.core.utilities.results.DataResult;
import kodlama.io.javaCamp6.core.utilities.results.Result;
import kodlama.io.javaCamp6.entities.concretes.Job;

public interface JobService {
DataResult<List<Job>>getAll();
Result add(Job job);
}
