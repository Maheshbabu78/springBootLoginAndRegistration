package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaInfoController {

	@GetMapping("/info")
	public String information() {
		return "message";
	}
}
