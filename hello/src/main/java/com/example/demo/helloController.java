package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping; 

@RestController
public class helloController {
	@GetMapping("/")
	public String hello() {
		return " Hello World";
	}
	

}
