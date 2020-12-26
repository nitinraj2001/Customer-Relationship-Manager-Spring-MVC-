package com.nitinraj.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/showMyLoginPage")
	public String showMyForm() {
		
		//return "plain-login";
		
		return "fency-login-form";
	}
	
	@RequestMapping("/access-denied")
	public String showAccessDeniedPage(){
		
		return "access-denied";
	}

}
