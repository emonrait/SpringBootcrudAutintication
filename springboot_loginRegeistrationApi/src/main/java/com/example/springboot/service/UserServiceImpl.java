package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.model.User;
import com.example.springboot.model.UserInfo;
import com.example.springboot.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(int userId) {
		return userRepository.getOne(userId);
	}

	@Override
	public User insertUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		User exiatingUser = userRepository.findById(user.getId()).orElse(null);
		exiatingUser.setName(user.getName());
		exiatingUser.setMobile(user.getMobile());
		exiatingUser.setPassword(user.getPassword());
		exiatingUser.setImagelink(user.getImagelink());
		return userRepository.save(exiatingUser);
	}

	@Override
	public String deleteUser(int userId) {
		userRepository.deleteById(userId);
		return "User removed !! " + userId;

	}

	@Override
	public User getUserByName(String name) {
		return userRepository.findByName(name);
	}

	@Override
	public User getUserByMobile(String mobile) {
		// TODO Auto-generated method stub
		return userRepository.findByMobile(mobile);
	}

	

	@Override
	public UserInfo authInfo(String mobile, String password) {
		// TODO Auto-generated method stub
		return userRepository.authInfo(mobile,password);
	}

}
