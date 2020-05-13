package com.dps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dps.repository.User;
import com.dps.service.UserService;

@RestController
@RequestMapping("/v1")
public class LoginController {

	@Autowired
	private  UserService userRepository;
	
	


	@RequestMapping("/")
	public String index() {
		System.out.println("ddshfgsg");
		return "Greetings from Spring Boot!";
	}
	
	
	@GetMapping("/getUserData")
	public User userValidation() {
		List<User> user= userRepository.getUserList();
       
		user.forEach(item -> System.out.println(item));
    return  (User) user;
	}
	
}


