package com.trilasoft;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.h2.H2ConsoleAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan(basePackages = "com.trilasoft")
public class MultipleDatabases1Application {

	public static void main(String[] args) {
		SpringApplication.run(MultipleDatabases1Application.class, args);
	}

//	@Bean
//	ModelMapper getModelMapper() {
//		return new ModelMapper();
//	}
}
