package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.classes.User;
import com.example.demo.classes.checkingAccount;

@SpringBootApplication
public class main {

	public static void main(String[] args) {
		SpringApplication.run(main.class, args);

		checkingAccount user2 = new checkingAccount("lucas", "lucas@email.com", "123pass", 200.0);
		User user = new User("John Doe", "doe@email.com", "password123");

	}

	
}
