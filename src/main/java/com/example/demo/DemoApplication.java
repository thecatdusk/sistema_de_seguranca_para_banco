package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import User;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		User usr = new User();
	}

	@RestController
	public class HelloController {

		
		@GetMapping("/payment")
		public String payment(){

			return "<h1>Payment Processed Successfully!</h1>";
		}

		@GetMapping("/dataUser"){
			return 
		}
	}
}
