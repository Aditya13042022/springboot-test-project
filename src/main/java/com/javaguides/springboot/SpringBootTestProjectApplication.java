package com.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
public class SpringBootTestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestProjectApplication.class, args);
	}

}
