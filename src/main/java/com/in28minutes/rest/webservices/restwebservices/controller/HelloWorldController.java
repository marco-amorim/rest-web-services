package com.in28minutes.rest.webservices.restwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(value = "/hello_world")
	public String sayHelloWorld() {
		return "Hello World!";
	}
}
