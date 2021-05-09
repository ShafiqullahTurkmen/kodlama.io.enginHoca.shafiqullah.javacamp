package day5homework.core.abstracts;

import day5homework.entities.concretes.User;

public interface UserNameValidationService {
	boolean isValidUserName(User user);
}
