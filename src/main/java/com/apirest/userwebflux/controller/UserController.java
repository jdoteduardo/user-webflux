package com.apirest.userwebflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.userwebflux.document.User;
import com.apirest.userwebflux.services.UserService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class UserController {
	@Autowired
	UserService service;
	
	@GetMapping(value = "/users")
	public Flux<User> getUser() {
		return service.findAll();
	}
	
	@GetMapping(value = "/user/{id}")
	public Mono<User> getUserId(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping(value = "/user")
	public Mono<User> save(@RequestBody User user) {
		return service.save(user);
	}
}
