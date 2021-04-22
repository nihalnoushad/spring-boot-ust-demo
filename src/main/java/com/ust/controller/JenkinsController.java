package com.ust.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

	@GetMapping("/")
	public String getHomePage() {
		return "Welcome Jenkins Home Page";
	}
	
	@GetMapping("/home")
	public String getAdminPage() {
		return "Welcome Jenkins Admin Page";
	}
}
