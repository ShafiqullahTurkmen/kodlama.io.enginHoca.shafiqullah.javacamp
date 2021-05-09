package day5homework.googleUserService;

import java.util.ArrayList;

import day5homework.entities.concretes.User;

public class GoogleDao {

	private ArrayList<String> email = new ArrayList<>();
	private ArrayList<User>   userArray = new ArrayList<>();
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Hibernate ile Systeme başarı ile kayd edildi");		
		email.add(user.getEmail());
		userArray.add(user);
	}

	
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<String> getEmail() {
		return email;
	}

	public void setEmail(ArrayList<String> email) {
		this.email = email;
	}

	
	public boolean isContain(User user) {

		if (userArray.contains(user)) {
			return true;
		} else {
			return false;
		}
	}
}
