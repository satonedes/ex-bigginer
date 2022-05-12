package com.example.service;

import org.springframework.stereotype.Service;

import com.example.domain.User;

@Service
public class UserService {
	public User save(User user) {
		return user;
	}

}
