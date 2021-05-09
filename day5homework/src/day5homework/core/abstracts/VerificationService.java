package day5homework.core.abstracts;

import day5homework.entities.concretes.User;

public interface VerificationService {
	boolean isVarified(User user);
}
