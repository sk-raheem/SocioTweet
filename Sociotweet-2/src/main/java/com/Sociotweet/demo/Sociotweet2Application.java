package com.Sociotweet.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.Sociotweet.*")
@SpringBootApplication
public class Sociotweet2Application {

	public static void main(String[] args) {
		SpringApplication.run(Sociotweet2Application.class, args);
	}

}
