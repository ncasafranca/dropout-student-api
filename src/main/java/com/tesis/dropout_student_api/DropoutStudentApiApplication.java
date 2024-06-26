package com.tesis.dropout_student_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class DropoutStudentApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DropoutStudentApiApplication.class, args);
	}

}
