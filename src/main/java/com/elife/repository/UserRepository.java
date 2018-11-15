package com.elife.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.elife.documents.Users;

public interface UserRepository extends MongoRepository<Users, Integer> {
}
