package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByName(String name);
	User findByMobile(String mobile);
	
	User findByMobilePassword(String mobile, String password);
	

	//public User userLogin(String mobile, String password);

}
