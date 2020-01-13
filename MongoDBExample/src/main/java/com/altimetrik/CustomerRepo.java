package com.altimetrik;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepo extends MongoRepository<Customer, Integer> {

	

	
}
