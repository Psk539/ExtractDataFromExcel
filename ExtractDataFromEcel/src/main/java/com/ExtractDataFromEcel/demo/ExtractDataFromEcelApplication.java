package com.ExtractDataFromEcel.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan(basePackages = { "com" })
@EnableJpaRepositories("com" )
@EntityScan("com.ExtractDataFromEcel.model")
@SpringBootApplication
public class ExtractDataFromEcelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExtractDataFromEcelApplication.class, args);
	}

}
