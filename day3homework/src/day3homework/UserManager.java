package day3homework;

public class UserManager {
	
	public void add(User user) {
		
		System.out.println(user.getUserName() + " kurs'e kayd edildi.");
		System.out.println(user.getUserName() + " isimli kullanıcının email addresi: " + user.getUserEmail());
	}

}
