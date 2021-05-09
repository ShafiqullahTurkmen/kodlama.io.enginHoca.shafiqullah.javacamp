package day5homework.core.abstracts;

import day5homework.entities.concretes.User;

public interface PasswordValidationServide {
	boolean isPasswordValid(User user);
}
