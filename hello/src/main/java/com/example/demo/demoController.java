package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

	@GetMapping("/web-services/hello")
	public String greet() {
		return " have a nice day";
	}
}
