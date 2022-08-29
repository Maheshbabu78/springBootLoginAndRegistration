package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
   //chages here
	public User findByEmail(String email);

	public User findByEmailAndPassword(String email, String password);

}
