package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KrishnaController {

	@GetMapping("/lord")
	public String lord() {
		return "karthikeya2 and three";
	}
}
