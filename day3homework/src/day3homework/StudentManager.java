package day3homework;

public class StudentManager extends UserManager{

	@Override
	public void add(User user) {
		System.out.println(user.getUserName() + " öğrenci kurs'e kayd edildi.");
		System.out.println(user.getUserName() + " öğrencinin email addresi: " + user.getUserEmail());

	}
}
