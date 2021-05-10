package ecommerce.entities.concretes;



import ecommerce.entities.abstracts.Entity;


public class User implements Entity{


	
	private int userId;
	private String userFirstname;
	private String userLastname;
	private String userEmail;
	private String userPassword;
	
	
	public User() {
		
		
	}


	public User(int userId, String userFirstname, String userLastname, String userEmail, String userPassword) {
		super();
		this.userId = userId;
		this.userFirstname = userFirstname;
		this.userLastname = userLastname;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}
	
	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserFirstname() {
		return userFirstname;
	}


	public void setUserFirstname(String userFirstname) {
		this.userFirstname = userFirstname;
	}


	public String getUserLastname() {
		return userLastname;
	}


	public void setUserLastname(String userLastname) {
		this.userLastname = userLastname;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	

	
	
}
