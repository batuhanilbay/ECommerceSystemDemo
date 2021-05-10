package ecommerce.dataAccess.concretes;

import java.util.List;

import ecommerce.dataAccess.abstracts.UserDao;
import ecommerce.entities.concretes.User;

//Database için kullanýcý bilgileri simülasyonu için interface ile birlikte kullanýldý.

public class DbUserDao implements UserDao{
	
	
	@Override
	public void addUser(User user) {
		
		System.out.println("Kullanýcý bilgileri sisteme kaydedildi:  " + user.getUserFirstname() + user.getUserLastname());
		
	}
	
	@Override
	public void deleteUser(User user) {
		
		System.out.println("Kullanýcý bilgileri sistemden silindi:  " + user.getUserFirstname() + user.getUserLastname());
		
	}
	
	@Override
	public void updateUser(User user) {
		
		System.out.println("Kullanýcý bilgileri sistemde güncellendi:  " + user.getUserFirstname() + user.getUserLastname());
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getEmail(String email) {
		System.out.println("Kullanýcý emaili sistemde:  " + email);
		return null;
	}

	@Override
	public User getId(int id) {
		System.out.println("Kullanýcý id sistemde:  " + id);
		return null;
	}

}
