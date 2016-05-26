package com.ying.learning_junit.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user/")
public class UserController {

	@RequestMapping(value = "/sign_in/{username}", method = RequestMethod.GET)
	public String signIn(@PathVariable("username") String username) {
		return username;
	}

}
