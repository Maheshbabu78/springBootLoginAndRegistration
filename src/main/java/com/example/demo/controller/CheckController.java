package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

	@GetMapping("/fullname")
	public String name() {
		return "mahesh";
	}
}
