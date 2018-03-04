package com.india.rest.module.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping("/getUserById")
	public Boolean getUserById(@RequestParam(value="userid") String userid )
	{
		User user =userService.getUserbyId(userid);
    	    if(user!=null)
    	    return true;
	    return false;
	}
	
	 @RequestMapping(method = RequestMethod.POST, value = "/saveUser")
	    public User createUser(@RequestBody User user)
	    {
	        return userService.createUser(user);
	    }
}
