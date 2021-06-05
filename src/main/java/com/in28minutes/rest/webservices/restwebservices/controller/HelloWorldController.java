package com.in28minutes.rest.webservices.restwebservices.controller;

import com.in28minutes.rest.webservices.restwebservices.model.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(value = "/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}

	@GetMapping(value = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World!");
	}

	@GetMapping(value = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello, %s", name));
	}

	@GetMapping(value = "/hello-world-i18n")
	public String helloWorldInternationalized() {
		return "Hello World!";
	}
}
