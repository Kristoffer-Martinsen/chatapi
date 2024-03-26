package com.example.chatapi.chatapi;

import com.github.dasniko.dotenv.DotenvPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatapiApplication.class, args);

		// Add DotenvPropertySource to environment before registering components
		DotenvPropertySource.addDotenv("src/main/resources/.env");
	}

}
