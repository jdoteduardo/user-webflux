package com.apirest.userwebflux.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.userwebflux.document.User;
import com.apirest.userwebflux.repository.UserRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository ur;
	
	
	@Override
	public Flux<User> findAll() {
		return ur.findAll();
	}

	@Override
	public Mono<User> findById(String id) {
		return ur.findById(id);
	}

	@Override
	public Mono<User> save(User user) {
		return ur.save(user);
	}

}
