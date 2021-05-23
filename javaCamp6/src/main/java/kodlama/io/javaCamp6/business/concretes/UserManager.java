package kodlama.io.javaCamp6.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlama.io.javaCamp6.business.abstracts.UserService;
import kodlama.io.javaCamp6.core.utilities.results.DataResult;
import kodlama.io.javaCamp6.core.utilities.results.Result;
import kodlama.io.javaCamp6.core.utilities.results.SuccessDataResult;
import kodlama.io.javaCamp6.dataAccess.abstracts.UserDao;
import kodlama.io.javaCamp6.entities.concretes.User;
import kodlama.io.javaCamp6.core.utilities.results.SuccessResult;
@Service
public class UserManager implements UserService{
	private UserDao userDao;
	@Autowired

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	@Override
	public DataResult<List<User>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Data listelendi.");
	}
	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Eklendi.");

	}
	
}
