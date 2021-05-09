package day5homework.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5homework.core.abstracts.UserNameValidationService;
import day5homework.entities.concretes.User;

public class GeldiGidiyorUserNameValidationManager implements UserNameValidationService {

	@Override
	public boolean isValidUserName(User user) {
String theValidRegex = "[a-zA-Z0-9@.#-_]{2,}";
		
		Pattern checkRegex = Pattern.compile(theValidRegex);
		Matcher regaxMatcherFirstName = checkRegex.matcher(user.getFirstName());
		Matcher regaxMatcherLastName = checkRegex.matcher(user.getLastName());
		if (regaxMatcherFirstName.find() && regaxMatcherLastName.find()) {
			return true;
		}
		else {
			return false;
		}
	}

}
