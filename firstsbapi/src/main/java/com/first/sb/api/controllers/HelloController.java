package com.first.sb.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping("/hello")
	public String helloWorld(){
		return "Welcome to SB Lectures";
	}
	
	
	
	
}
