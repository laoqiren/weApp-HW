package com.umis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.umis.entity.Users;

@Controller
public class HomeController {

	@RequestMapping("/register")
	public String register(String userNumber){
		//System.out.println("hellominuib");
		return "register";
	}
	
	@RequestMapping("/index")
	public String login(){
		//System.out.println("hellominuib"); 
		
		
		return "index";
	}

	
	@RequestMapping("/login.do")
	public String register(Users users){
		
        System.out.println(users.toString());
        
        
        
        return "success";  
	}

}
