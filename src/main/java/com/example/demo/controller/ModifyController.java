package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModifyController {

	@GetMapping
	public String getInformation() {
		return "maheshbabuOne";
	}
	@GetMapping
	public String getInformation2() {
		return "maheshbabuOne";
	}
	
}
