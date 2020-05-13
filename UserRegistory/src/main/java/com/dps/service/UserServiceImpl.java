package com.dps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dps.repository.User;
import com.dps.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
@Autowired
UserRepository useRepo;

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return useRepo.findAll();
	}

}
