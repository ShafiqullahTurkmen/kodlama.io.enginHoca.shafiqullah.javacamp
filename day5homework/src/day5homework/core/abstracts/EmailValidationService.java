package day5homework.core.abstracts;

import day5homework.entities.concretes.User;

public interface EmailValidationService {
	boolean isValidEmail(User user);
	boolean isusedEmail(User user);
}
