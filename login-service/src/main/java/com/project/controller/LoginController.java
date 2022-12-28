package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Login;
import com.project.entity.Passenger;
import com.project.service.LoginService;

@RestController
@CrossOrigin(origins = "*")
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@PostMapping("/user/save")
	public Login saveUser(@RequestBody Login login) {
		return service.saveUser(login);
	}
	
	@PostMapping("/login")
	public Login loginUser(@RequestBody Login user) throws Exception {
		String tempUsername = user.getUserName();
		String tempPassword = user.getPassword();
		Login userObj = null;
		if(tempUsername !=null && tempPassword != null) {
			userObj = service.fetchUserByUsernameAndPassword(tempUsername, tempPassword);
		}
		if(userObj == null) {
			throw new Exception("Bad credentials");
		}
		return userObj;
	}
	
}
