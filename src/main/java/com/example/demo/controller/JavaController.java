package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaController {

	@GetMapping
	public String getInfo() {
		return "mahesh";
	}
	
	@GetMapping
	public String getInfo1() {
		return "mahesh";
	}
}
