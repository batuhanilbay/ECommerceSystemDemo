package ecommerce.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ecommerce.business.abstracts.VerifyRegisterService;
import ecommerce.dataAccess.abstracts.UserDao;
import ecommerce.entities.concretes.User;

public class VerifyRegisterManager implements VerifyRegisterService {

	@Override
	public boolean verifyFirstName(String userFirstname) {
		if(userFirstname.length() < 2 ) {
			System.out.println("Ýsim en az 2 karakterden oluþmalýdýr ! ");
		}
		else System.out.println("Ýsim en az 2 karakter kuralýný saðlýyor");
		
		return true;
		}

	@Override
	public boolean verifyLastName(String userLastname) {
		if(userLastname.length() < 2 ){
			System.out.println("Soyisim en az 2 karakterden oluþmalýdýr ! ");
		}
		else System.out.println("Soyisim en az 2 karakter kuralýný saðlýyor");
		return true;
	}

	@Override
	public boolean verifyPassword(String userPassword) {
		
		if(userPassword.length() >= 6) {
			System.out.println("Þifre oluþturuldu ");
			return true;
		}
		else 
			System.out.println("Þifre en az 6 karakterden oluþmalýdýr.");
		return false;
	}

	@Override
	public boolean verifyEmail(String userEmail) {
		
	
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(userEmail);
		
		if(matcher.matches()) {
			System.out.println("Mail formatý doðru ! ");
			return true;
		}
		else {
			System.out.println("Mail formatý yanlýþ ! ");
			return false;
		}
		
		
		
		
	
			
		
	}
	

	@Override
	public boolean verifyUser(User user) {

		if(!verifyFirstName(user.getUserFirstname())) {
			return false;
		}
		else if(!verifyLastName(user.getUserLastname())) {
			return false;
		}
		else if(!verifyPassword(user.getUserPassword())) {
			return false;
		}
		else if(!verifyEmail(user.getUserEmail())) {
			return false;
		}
		
		
		
		System.out.println("Kullanýcý bilgileri doðrulandý ! ");
		return true;
	}


	public boolean verifyUserDao(UserDao userDao,String userEmail) {
		
	
		User user = userDao.getEmail(userEmail);
		
		if(user.getUserEmail() != userEmail);
		else if(user.getUserEmail() == userEmail){
			System.out.println("Kullanýcý Email adresi doðrulandý");
			return true;
		}
		return false;
		 
		
		
		
		
		
		

	}

	
	
	
	

}
