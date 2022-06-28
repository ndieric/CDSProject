package com.example.Pays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PaysApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaysApplication.class, args);
	}
	@GetMapping("/verifier")
	public String affichage(){
		return "Bravo";
	}

}
