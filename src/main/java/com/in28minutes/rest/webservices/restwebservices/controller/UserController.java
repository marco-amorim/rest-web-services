package com.in28minutes.rest.webservices.restwebservices.controller;

import java.util.List;

import com.in28minutes.rest.webservices.restwebservices.dao.UserDaoService;
import com.in28minutes.rest.webservices.restwebservices.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserDaoService userDaoService;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userDaoService.findAll();
	}

	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id) {
		return userDaoService.finOne(id);
	}

	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User savedUser = userDaoService.save(user);

		return ResponseEntity.status(201).body(savedUser);
	}
}
