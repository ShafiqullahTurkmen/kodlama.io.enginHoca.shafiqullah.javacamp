package day5homework.adapter.abstracts;

import day5homework.entities.concretes.User;

public interface ExternelUserService {
	void signIn(User user);
	void login(User user);
}
