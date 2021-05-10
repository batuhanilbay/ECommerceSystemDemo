package ecommerce.dataAccess.concretes;

import java.util.List;

import ecommerce.dataAccess.abstracts.UserDao;
import ecommerce.entities.concretes.User;

//Database i�in kullan�c� bilgileri sim�lasyonu i�in interface ile birlikte kullan�ld�.

public class DbUserDao implements UserDao{
	
	
	@Override
	public void addUser(User user) {
		
		System.out.println("Kullan�c� bilgileri sisteme kaydedildi:  " + user.getUserFirstname() + user.getUserLastname());
		
	}
	
	@Override
	public void deleteUser(User user) {
		
		System.out.println("Kullan�c� bilgileri sistemden silindi:  " + user.getUserFirstname() + user.getUserLastname());
		
	}
	
	@Override
	public void updateUser(User user) {
		
		System.out.println("Kullan�c� bilgileri sistemde g�ncellendi:  " + user.getUserFirstname() + user.getUserLastname());
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getEmail(String email) {
		System.out.println("Kullan�c� emaili sistemde:  " + email);
		return null;
	}

	@Override
	public User getId(int id) {
		System.out.println("Kullan�c� id sistemde:  " + id);
		return null;
	}

}
