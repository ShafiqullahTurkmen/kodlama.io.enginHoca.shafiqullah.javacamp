package day3homework;

public class InstructorManager extends UserManager{

	@Override
	public void add(User user) {
		System.out.println(user.getUserName() + " öğretmen kurs'e kayd edildi.");
		System.out.println(user.getUserName() + " öğretmenin email addresi: " + user.getUserEmail());

	}

}
