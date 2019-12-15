package com.mysqldemo.mysqldemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqldemoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MysqldemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setEmail("email@mail.ca");
		user.SetName("andres");
		userRepository.save(user);
		
		User user2 = new User();
		user2.setEmail("email2@mail.ca");
		user2.SetName("felipe");
		userRepository.save(user2);
		
		for(User u: userRepository.findAll()) {
			System.out.println(u.getName());
		}
		
	}

}
