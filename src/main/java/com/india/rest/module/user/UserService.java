package com.india.rest.module.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired 
	UserRepository userRepository;
	
	public User getUserbyIdAndPassword( String username, String password)
	{
		User u =userRepository.findByUsernameAndPassword(username,password);
		System.out.println("user ="+u);
				if(u==null)
					return null;
				else
					return u;
	}

}
