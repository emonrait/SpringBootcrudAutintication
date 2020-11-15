package com.example.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.User;
import com.example.springboot.model.UserInfo;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByName(String name);
	User findByMobile(String mobile);
	
	//User findByMobilePassword(String mobile, String password);
	
	@Query(value = "select new com.example.springboot.model.UserInfo(mobile,password,name,imagelink) FROM User where mobile= ?1 AND password = ?2 ")
	public UserInfo authInfo(String mobile, String password );

}
