package com.work.WorkshopMongoDB;

import com.work.WorkshopMongoDB.Repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class WorkshopMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshopMongoDbApplication.class, args);
	}

}
