package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.User;
import com.example.springboot.service.UserService;

@RestController
public class MainController {

	@Autowired
	UserService userService;

	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		String tempmobile=user.getMobile();
		
		
		return userService.insertUser(user);
	}

	@GetMapping("/users")
	public List<User> findAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/login")
	public User userLogin(@RequestBody User user) {
		String tempMobile = user.getMobile();
		String temPassword = user.getPassword();
		User userobj = null;

		if (tempMobile != null && temPassword != null) {
			//userobj = userService.userLogin(tempMobile, temPassword);
		}
		return userobj;
	}

	@GetMapping("/userById/{id}")
	public User findUserById(@PathVariable int id) {
		return userService.getUser(id);
	}

	@GetMapping("/users/{name}")
	public User findUserByName(@PathVariable String name) {
		return userService.getUserByName(name);
	}
	
	@GetMapping("/users/{mobile}")
	public User findUserByMobile(@PathVariable String mobile) {
		return userService.getUserByMobile(mobile);
	}

	@PutMapping("/update")
	public User updateProduct(@RequestBody User user) {
		return userService.updateUser(user);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		return userService.deleteUser(id);
	}
}
