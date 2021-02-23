package com.apirest.userwebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserWebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserWebfluxApplication.class, args);
		System.out.println("Olá mundo com webflux");
	}

}
