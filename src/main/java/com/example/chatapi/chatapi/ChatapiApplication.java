package com.example.chatapi.chatapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Config.class)
public class ChatapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatapiApplication.class, args);
	}

}
