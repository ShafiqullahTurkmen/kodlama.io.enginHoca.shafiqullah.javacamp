package day5homework.dataAccess.abstracts;

import java.util.ArrayList;

import day5homework.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	ArrayList<String> getEmail();
	boolean isContain(User user);
}
