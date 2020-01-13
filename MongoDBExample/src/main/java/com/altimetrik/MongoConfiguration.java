package com.altimetrik;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = CustomerRepo.class)
@Configuration
public class MongoConfiguration {
	
	@Bean
	CommandLineRunner commandLineRunner(CustomerRepo repo) {
		System.out.println("called ");
		return string ->{
			repo.save(new Customer(2616, "neha", "mehta"));
			repo.save(new Customer(6812, "neha6812", "mehta"));
		};
	}
		
		/*
		 * new CommandLineRunner() {
		 * 
		 * @Override public void run(String... args) throws Exception { // TODO
		 * Auto-generated method stub repo.save(new Customer(2616, "neha", "mehta"));
		 * 
		 * } };
		 */
		
	

}
