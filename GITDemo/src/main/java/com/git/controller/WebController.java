package com.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@GetMapping("/hi")
	public String sayHi() {
		
		return "Hi world";

	}
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Hello World";
	}
}
