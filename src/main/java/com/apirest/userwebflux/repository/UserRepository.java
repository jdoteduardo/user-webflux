package com.apirest.userwebflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.userwebflux.document.User;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
	
}
