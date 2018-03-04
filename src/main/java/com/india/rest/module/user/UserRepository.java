package com.india.rest.module.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String>{

	public User findByUsernameAndPassword(String userId, String password);
	
	public User findByUsername(String userid);
}
