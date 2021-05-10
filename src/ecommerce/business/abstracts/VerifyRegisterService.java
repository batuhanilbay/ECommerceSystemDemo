package ecommerce.business.abstracts;

import ecommerce.dataAccess.abstracts.UserDao;
import ecommerce.entities.concretes.User;

public interface VerifyRegisterService {
	
	boolean verifyFirstName(String  userFirstname);
	boolean verifyLastName(String  userLastname);
	boolean verifyPassword(String userPassword);
	boolean verifyEmail(String userEmail);
	boolean verifyUser(User user);

	boolean verifyUserDao(UserDao userDao, String userEmail);
	
	
}
