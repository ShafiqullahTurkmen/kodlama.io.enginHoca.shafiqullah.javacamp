package day3homework;

public class User {
	
	private String userName;
	private String userEmail;
	private String password;
	
	


	public User(String userName, String userEmail, String password) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.password = password;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPassWord() {
		return password;
	}
	public void setPassWord(String passWord) {
		this.password = passWord;
	}
	

}
