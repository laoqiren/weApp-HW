package com.umis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umis.entity.Users;
import com.umis.exception.UsersException;
import com.umis.service.UsersService;

@RestController
public class UsersController {
	
	/*@Autowired
	 private UsersService userService ;
	
	@RequestMapping(value="/adduser")
	public String addUsers() throws UsersException{
		
		Users user =new Users();
		
		userService.addUser(user);
		
		return "success";
	}
	
	@RequestMapping(value="/getuser")
	public Users getUsers() throws UsersException{
		
		
		
		return userService.getUser("cl");
			
		
		//return "failed";
	}
	
	@RequestMapping(value="/updateuser")
	public Users updateUsers() throws UsersException{
		
		Users user=new Users();
		
		return userService.updateUser(user);
			
		
		//return "failed";
	}*/
	
}