package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddedController {

	@GetMapping("/homeOneInfo")
	public String Page() {
		return "homePage";
	}
	
	@GetMapping("/homeOneInfo")
	public String PageOne() {
		return "homePage";
	}
}
