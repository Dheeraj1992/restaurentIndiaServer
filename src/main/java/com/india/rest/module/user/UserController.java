package com.india.rest.module.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	
	@Autowired 
	UserService userService;
	
	@RequestMapping("/getUserbyIdAndPassword")
	public Boolean getUser(@RequestParam(value="username") String username,@RequestParam(value="password") String password )
	{
		User user =userService.getUserbyIdAndPassword(username, password);
    	    if(user!=null)
    	    return true;
	    return false;
	}
}
