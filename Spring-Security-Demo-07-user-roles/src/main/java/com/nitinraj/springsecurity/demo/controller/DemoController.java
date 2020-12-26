package com.nitinraj.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DemoController {

	@RequestMapping("/")
	public String showHome() {
		
		return "home";
	}
	
	@RequestMapping("/leaders")
	public String showLeadersHomePage() {
		
		return "leaders";
	}
	
	@RequestMapping("/systems")
	public String showSystems() {
		
		return "systems";
	}
}
