package com.dps.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dps.repository.User;

@Service
public interface UserService {
	List<User> getUserList();

}
