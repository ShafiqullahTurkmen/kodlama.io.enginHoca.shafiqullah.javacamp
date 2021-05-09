package day5homework.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5homework.core.abstracts.PasswordValidationServide;
import day5homework.entities.concretes.User;

public class GeldiGidiyorPasswordValidationManager implements PasswordValidationServide {

	@Override
	public boolean isPasswordValid(User user) {

	String theValidRegex = "[a-zA-Z0-9@.#-_]{6,}";
		
		Pattern checkRegex = Pattern.compile(theValidRegex);
		Matcher regaxMatcher = checkRegex.matcher(user.getPassword());
		if (regaxMatcher.find()) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
