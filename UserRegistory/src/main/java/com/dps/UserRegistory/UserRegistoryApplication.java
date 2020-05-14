package com.dps.UserRegistory;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class UserRegistoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRegistoryApplication.class, args);
		System.out.println("main class");
	}

}
