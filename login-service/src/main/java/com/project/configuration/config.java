package com.project.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class config {
	@Bean
	public RestTemplate resttemplate() {
		return new RestTemplate();
	}

}
