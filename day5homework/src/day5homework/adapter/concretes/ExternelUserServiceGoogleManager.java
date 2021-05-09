package day5homework.adapter.concretes;

import day5homework.adapter.abstracts.ExternelUserService;
import day5homework.core.concretes.EmailVarificationManager;
import day5homework.core.concretes.GeldiGidiyorEmailValidationManager;
import day5homework.core.concretes.GeldiGidiyorPasswordValidationManager;
import day5homework.core.concretes.GeldiGidiyorUserNameValidationManager;
import day5homework.entities.concretes.User;
import day5homework.googleUserService.GoogleDao;
import day5homework.googleUserService.GoogleUserManager;

public class ExternelUserServiceGoogleManager implements ExternelUserService{
	GeldiGidiyorUserNameValidationManager     name = new GeldiGidiyorUserNameValidationManager();
	GeldiGidiyorEmailValidationManager       email = new GeldiGidiyorEmailValidationManager();
	GeldiGidiyorPasswordValidationManager password = new GeldiGidiyorPasswordValidationManager();
	
	GoogleUserManager userManager = new GoogleUserManager(email, password, name, new GoogleDao(), new EmailVarificationManager());
	@Override
	public void signIn(User user) {
		userManager.signIn(user);
		
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		
	}

}
