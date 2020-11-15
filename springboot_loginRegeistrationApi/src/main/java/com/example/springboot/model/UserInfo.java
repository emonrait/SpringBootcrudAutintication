package com.example.springboot.model;

public class UserInfo {
	String mobile;
	String password;
	String name;
	String imagelink;
	
	
	

	public UserInfo(String mobile, String password, String name, String imagelink) {
		super();
		this.mobile = mobile;
		this.password = password;
		this.name = name;
		this.imagelink = imagelink;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImagelink() {
		return imagelink;
	}

	public void setImagelink(String imagelink) {
		this.imagelink = imagelink;
	}

	public UserInfo(String mobile, String password) {
		super();
		this.mobile = mobile;
		this.password = password;
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

}
