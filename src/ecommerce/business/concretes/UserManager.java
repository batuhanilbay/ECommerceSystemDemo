package ecommerce.business.concretes;

import java.util.List;

import ecommerce.business.abstracts.UserService;
import ecommerce.dataAccess.abstracts.UserDao;
import ecommerce.entities.concretes.User;

public class UserManager implements UserService {

	
	private UserDao userDao;
	
	public UserManager() {
		
	}
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	

	@Override
	public void register(User user,UserDao userDao) {
		userDao.addUser(user);
		System.out.println("Kullanýcý kaydedildi: " + user.getUserFirstname());
		
	}

	@Override
	public void update(User user,UserDao userDao) {
		userDao.updateUser(user);
		System.out.println("Kullanýcý güncellendi: " + user.getUserFirstname());
	}

	@Override
	public void delete(User user,UserDao userDao) {
		userDao.updateUser(user);
		System.out.println("Kullanýcý silindi: " + user.getUserFirstname());
		
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll() ; 
		
	}





	


	
	



}
