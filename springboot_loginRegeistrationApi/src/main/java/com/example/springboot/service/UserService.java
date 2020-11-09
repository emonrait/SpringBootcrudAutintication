package com.example.springboot.service;

import java.util.List;


import com.example.springboot.model.User;

public interface UserService {
	

	public List<User> getAllUsers();

	public User getUser(int userId);

	public User insertUser(User user);

	public User updateUser(User user);

	public String deleteUser(int userId);

	public User userLogin(String mobile, String password);
	
	public User getUserByName(String name);
	
	public User getUserByMobile(String mobile);
}
