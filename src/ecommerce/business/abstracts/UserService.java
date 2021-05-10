package ecommerce.business.abstracts;

import java.util.List;

import ecommerce.dataAccess.abstracts.UserDao;
import ecommerce.entities.concretes.User;

public interface UserService {
	
	
	void register(User user,UserDao userDao);
	void update(User user,UserDao userDao);
	void delete(User user,UserDao userDao);
	


	
	
	List<User> getAll();
	
	
	

}
