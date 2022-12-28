package com.project;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.entity.Login;
import com.project.repository.LoginRepository;

@SpringBootTest
class LoginServiceApplicationTests {

	@Autowired
	LoginRepository repository;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	private void saveUser() {
		
	}
	
	@Test
	public void findAllUser() {
		List l=repository.findAll();
		assertThat(l).size().isGreaterThan(0);
	}
	
	@Test
	public void findByIdTest() {
		Login l=repository.findById(10).get();
		assertEquals("vrushabh", l.getUserName());
	}

}
