package com.apirest.userwebflux.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.apirest.userwebflux.document.User;
import com.apirest.userwebflux.repository.UserRepository;
import java.util.UUID;

import javax.annotation.PostConstruct;

import reactor.core.publisher.Flux;

@Service
public class DummyDataService {

	@Autowired
	UserRepository userRepository;

	//@PostConstruct
	public void createUsers(){
		userRepository.deleteAll()
	    	.thenMany(
	   			 Flux.just("Eduardo Lemos", "José Eduardo", "Matheus Felipe", "André Racz",
	   					 "Rodrigo Tavares", "Michelli Brito")
	   			 .map(nomeCompleto -> new User(UUID.randomUUID().toString(), nomeCompleto)).flatMap(userRepository::save))
	   	 	.subscribe(System.out::println);

	    }
}
