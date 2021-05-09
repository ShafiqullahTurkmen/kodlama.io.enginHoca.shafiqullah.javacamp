package day5homework;

import day5homework.adapter.concretes.ExternelUserServiceGoogleManager;
import day5homework.businuss.concretes.GeldiGidiyorUserManager;
import day5homework.core.concretes.EmailVarificationManager;
import day5homework.core.concretes.GeldiGidiyorEmailValidationManager;
import day5homework.core.concretes.GeldiGidiyorPasswordValidationManager;
import day5homework.core.concretes.GeldiGidiyorUserNameValidationManager;
import day5homework.dataAccess.concretes.HibernateDao;
import day5homework.entities.concretes.User;
import day5homework.googleUserService.GoogleDao;
import day5homework.googleUserService.GoogleUserManager;

public class Main {

	public static void main(String[] args) {

		User user1 = new User("Mehmet", "Ali", "blah@gmail.com", "abcdef");
		GeldiGidiyorUserNameValidationManager     name = new GeldiGidiyorUserNameValidationManager();
		GeldiGidiyorEmailValidationManager       email = new GeldiGidiyorEmailValidationManager();
		GeldiGidiyorPasswordValidationManager password = new GeldiGidiyorPasswordValidationManager();
		HibernateDao                          dao      = new HibernateDao();
		
		GeldiGidiyorUserManager            userManager = new GeldiGidiyorUserManager(email, password, name, dao, new EmailVarificationManager(),
														 new ExternelUserServiceGoogleManager());
		userManager.signIn(user1);
		/*
		System.out.println("****************************************************");
		User user2 = new User("Mehmet", "Ali", "blah@gmail.com", "abcdef");
		userManager.signIn(user2);
		
		System.out.println("******************************************************");
		
		userManager.login(user1); */
		
		
	
	}

}
