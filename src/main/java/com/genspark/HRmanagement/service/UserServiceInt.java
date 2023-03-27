package com.genspark.HRmanagement.service;

import com.genspark.HRmanagement.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserServiceInt extends UserDetailsService{
	//to save user registration data
	User save(User user) throws Exception;
	//to retrieve user by email
	List<User> getAllUsers();
}
