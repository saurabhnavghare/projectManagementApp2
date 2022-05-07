package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmaApplication.class, args);
	}
	
	public void show() {
		System.out.println("Welcome to Jira Project");
	}

}
