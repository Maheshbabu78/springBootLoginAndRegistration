package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaInfoController {

	@GetMapping("/homepage")
	public String homePageOne() {
		return "welcome to homepage";
	}
}
