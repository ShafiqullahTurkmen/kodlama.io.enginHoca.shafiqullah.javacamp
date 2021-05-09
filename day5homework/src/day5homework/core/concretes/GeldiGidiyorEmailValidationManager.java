package day5homework.core.concretes;

import java.util.regex.*;
import java.util.regex.Pattern;

import day5homework.core.abstracts.EmailValidationService;
import day5homework.entities.concretes.User;

public class GeldiGidiyorEmailValidationManager implements EmailValidationService {

	@Override
	public boolean isValidEmail(User user) {
		
			String theValidRegex = "[A-Za-z0-9._\\%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}";
			
			Pattern checkRegex = Pattern.compile(theValidRegex);
			Matcher regaxMatcher = checkRegex.matcher(user.getEmail());
			if (regaxMatcher.find()) {
				return true;
			}
			else {
				return false;
			}
	}

	@Override
	public boolean isusedEmail(User user) {

		return false;
	}

}
