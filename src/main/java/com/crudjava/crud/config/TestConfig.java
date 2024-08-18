package com.crudjava.crud.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.crudjava.crud.entities.User;
import com.crudjava.crud.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository; 
	
	@Override 
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Demon Souls", "demon@gmail.com", "123", "O inicio");
		User u2 = new User(null, "Dark souls", "darksouls@gmail.com", "123", "Inesquecivel");
		User u3 = new User(null, "Dark souls 3", "darksouls3@gmail.com", "123", "O ultimo mais o melhor");

		userRepository.saveAll(Arrays.asList(u1, u2, u3));
		

	}

}
