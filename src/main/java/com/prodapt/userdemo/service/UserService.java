package com.prodapt.userdemo.service;

import java.util.List;

import com.prodapt.userdemo.entity.User;
import com.prodapt.userdemo.exceptions.InvalidCredentialsException;

public interface UserService {
	//Create
			public User addUser(User user);
			//Retrieve
			public User getUserByName(String userName);
			
			//Update
			public User updateUser(User user);
			
			//Delete
			public void deleteUserById(Long id);
			//Login
			public User loginUser(User user) throws InvalidCredentialsException;
			
			public List<User> getList();

}
