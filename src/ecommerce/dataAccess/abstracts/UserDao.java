package ecommerce.dataAccess.abstracts;

import java.util.List;

import ecommerce.entities.concretes.User;

//Kullan�c� bilgilerinin database taraf� i�in, interface olu�turuldu. 

public interface UserDao {

	void addUser(User user);
	void deleteUser(User user);
	void updateUser(User user);
	
	User getEmail(String email);
	User getId(int id);
	
	
	List<User> getAll();
	

}
