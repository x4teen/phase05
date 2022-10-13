package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "<h1>Welcome to Public Home Page.</h2>";
	}
	
	@GetMapping("/admin")
	public String adminPortal() {
		return "<h1>Welcome to the Adminstrator's Portal</h1>";
	}
	
	@GetMapping("/admin/dashboard")
	public String adminDashboard() {
		return "<h1>Welcome to the Adminstrator's Dashbaord</h1>";
	}
	
	@GetMapping("/user")
	public String userPortal() {
		return "<h1>Welcome to User Portal</h1>";
	}
	
	@GetMapping("/user/{id}")
	public String userDashboard(@PathVariable("id") String id) {
		return "<h1>Welcome to User # "+id+"'s Dashboard</h1>";
	}

}
