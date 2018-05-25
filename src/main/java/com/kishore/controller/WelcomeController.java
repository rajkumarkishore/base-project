package com.kishore.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@Value("${welcome.message}")
	private String message;

	@Value("${spring.profiles.active}")
	private String activeProfile;

	@GetMapping(value = "welcome")
	public String welcome() {
		return message + "; Active profile: " + activeProfile;
	}

}
