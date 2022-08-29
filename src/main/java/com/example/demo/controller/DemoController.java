package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DemoController {

	@Autowired
	private UserService userService;

	@GetMapping("/home")
	public String homePage() {
		return "welcome to homePageOne";
	}
	
	@GetMapping("/demo")
	public String demoPage() {
		return "welcome to homepage";
	}

	@GetMapping("/data")
	public String dataPage() {
		return "welcome to homepage";
	}
	@GetMapping("/userwelcome")
	public String welcomePage() {
		return "welcome Page maheshbabu";
	}

	@PostMapping("/register")
	public User saveUserInfo(@RequestBody User user) throws Exception {
		User userobj = null;
		userobj = userService.findByUserEmail(user.getEmail());
		if (userobj == null) {
			userobj = userService.saveUserData(user);
		} else {
			throw new Exception("User already registered " + user.getEmail());
		}
		return userobj;

	}

	@PostMapping("/login")
	public User loginMethod(@RequestBody User user) throws Exception {
		User userobj = null;
		String tempmail = user.getEmail();
		String temppass = user.getPassword();
		if (tempmail != null && temppass != null) {
			userobj = userService.findbyEmailAndPass(tempmail, temppass);
			if (userobj == null) {
				throw new Exception("please check credentials");
			} else {
				return userobj;
			}
		}
		return userobj;
	}
}
