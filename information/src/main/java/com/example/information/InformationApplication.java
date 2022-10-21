package com.example.information;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class InformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(InformationApplication.class, args);
	}



}
