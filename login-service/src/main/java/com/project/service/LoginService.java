package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.entity.Login;
import com.project.entity.Passenger;
import com.project.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepository;
	@Autowired
	RestTemplate rest;
	
	public Login saveUser(Login login) {
		return loginRepository.save(login);
	}

	public Login fetchUserByUsernameAndPassword(String Username, String Password) {
		return loginRepository.findByUserNameAndPassword(Username,Password);
	}
	
}
