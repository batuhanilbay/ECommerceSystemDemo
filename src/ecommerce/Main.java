package ecommerce;

import ecommerce.business.concretes.UserManager;
import ecommerce.business.concretes.VerifyRegisterManager;
import ecommerce.dataAccess.abstracts.UserDao;
import ecommerce.dataAccess.concretes.DbUserDao;
import ecommerce.entities.concretes.User;




public class Main {



	public static void main(String[] args) {
		
		User user = new User(1,"FirstName","SecondName","gmail@gmail.com","12347786");
		UserDao userDao = new DbUserDao();
		
		
		UserManager userManager1 = new UserManager();
		userManager1.register(user,userDao);
		userManager1.delete(user,userDao);
		
		VerifyRegisterManager verify1 = new VerifyRegisterManager();
		verify1.verifyEmail(user.getUserEmail());
		verify1.verifyPassword(user.getUserPassword());
		verify1.verifyFirstName(user.getUserFirstname());
		
		
		

		
		
		
		
		
		
		
	}

}
