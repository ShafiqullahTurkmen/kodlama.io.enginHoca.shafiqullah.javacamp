package day3homework;

public class Main {

	public static void main(String[] args) {

		User user1 = new Instructor("Tahir", "tahir@yaani.com", "1234");
		User user2 = new Instructor("Engin", "engin@yaani.com", "1235");
		User user3 = new Student("Shafiqullah", "shef@yaani.com", "1234");
		User user4 = new Student("Alp", "alp@yaani.com", "1347");
		User[] users = { user1, user2, user3, user4};

		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		for (User user : users) {
			
			if (user instanceof Instructor) {
				
				instructorManager.add(user);
				System.out.println("***************************");
				
			} else if(user instanceof Student) {
				
				studentManager.add(user);
				System.out.println("******************************");
				
			} else {
				userManager.add(user);
			}
		}
		
	}

}
