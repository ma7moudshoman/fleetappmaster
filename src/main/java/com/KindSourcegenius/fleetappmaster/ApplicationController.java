package com.KindSourcegenius.fleetappmaster;


import com.KindSourcegenius.fleetappmaster.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}

//	@RequestMapping("/oauthLogin")
//	public String oauthLogin() {
//		return "http://localhost:8080/login/oauth2/code/google";
//	}

	@GetMapping("/accessDenied")
	public String accessDenied(){
		return "accessDenied";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/index")
	public String homePage() {
		return "index";
	}
	
	@RequestMapping("/blank")
	public String blank() {
		return "blank";
	}

}
