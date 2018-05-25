package com.kishore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kishore.data.User;
import com.kishore.exception.UserNotFoundException;

@RestController
public class WelcomeController {

	@GetMapping(value = "users/{userId}")
	public User getUserDetailsById(@PathVariable("userId") Long id) {
		User user = new User();
		user.setId(id);
		
		int i=1/0;
		
		if(id!=1) {
			throw new UserNotFoundException("Id - " +id);
		}
		return user;

	}

}
