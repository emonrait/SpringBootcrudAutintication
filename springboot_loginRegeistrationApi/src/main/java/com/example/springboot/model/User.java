package com.example.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.stereotype.Indexed;

@Entity
public class User {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String mobile;
	private String password;
	private String imagelink;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String mobile, String password, String imagelink) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.password = password;
		this.imagelink = imagelink;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImagelink() {
		return imagelink;
	}

	public void setImagelink(String imagelink) {
		this.imagelink = imagelink;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobile=" + mobile + ", password=" + password + ", imagelink="
				+ imagelink + "]";
	}

}
