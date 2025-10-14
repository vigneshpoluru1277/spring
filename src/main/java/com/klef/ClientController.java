package com.klef;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 

public class ClientController {
	@GetMapping("/")
	public String d() {
		return "Spring boot executed successfully";
	}  
	@GetMapping("/demo")
	public String demo() {
		return "Jenkins Demo";
	}  
	@GetMapping("/test")
	public String test() {
		return "Deploy Spring Boot using Jenkins";
	} 
}