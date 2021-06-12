package com.example.access.accessgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
public class AccessgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessgatewayApplication.class, args);
	}

}
