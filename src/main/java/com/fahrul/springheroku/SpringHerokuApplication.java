package com.fahrul.springheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringHerokuApplication {
	
	@GetMapping("/")
	public String ping() {
		return "Welcome to Heroku Istimiwir";
	}
	
	@GetMapping("/message/{input}")
	public String getMessage(@PathVariable String input) {
		return "Welcome : " + input;
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringHerokuApplication.class, args);
	}

}
