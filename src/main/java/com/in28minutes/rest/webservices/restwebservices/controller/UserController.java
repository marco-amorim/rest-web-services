package com.in28minutes.rest.webservices.restwebservices.controller;

import java.util.List;

import com.in28minutes.rest.webservices.restwebservices.dao.UserDaoService;
import com.in28minutes.rest.webservices.restwebservices.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/users")
	public List<User> getAllUsers() {
		UserDaoService userDaoService = new UserDaoService();

		return userDaoService.findAll();
	}
}
