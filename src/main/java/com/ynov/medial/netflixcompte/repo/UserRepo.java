package com.ynov.medial.netflixcompte.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ynov.medial.netflixcompte.model.User;

public interface UserRepo extends MongoRepository<User, String> {
	
}
