package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	//comment
	public User saveUserData(User user) {
		return userRepository.save(user);
	}
	//comment 2
	public User findByUserEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public User findbyEmailAndPass(String email, String password) {
		return userRepository.findByEmailAndPassword(email, password);
	}
}
