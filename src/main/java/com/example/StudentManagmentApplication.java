package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component("com.example")
public class StudentManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentApplication.class, args);
	}

}
