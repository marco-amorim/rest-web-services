package com.in28minutes.rest.webservices.restwebservices.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.in28minutes.rest.webservices.restwebservices.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();

	private static int usersCount = 3;

	static {
		users.add(new User(1, "User 1", new Date()));
		users.add(new User(2, "User 2", new Date()));
		users.add(new User(3, "User 3", new Date()));
	}

	public User finOne(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	public List<User> findAll() {
		return users;
	}

	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}

	public User deleteById(int id) {
		Iterator<User> iterator = users.iterator();

		while (iterator.hasNext()) {
			User user = iterator.next();

			if (user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}

}
