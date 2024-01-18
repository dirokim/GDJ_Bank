package com.winter.app.member;

import java.util.List;

public class MemberDTO {

	
	private String userName;
	private String password;
	private String name;
	private String email;
	private String phone;
	private String address;
	
	private List<Avatar> avatarFiles;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Avatar> getAvatarFiles() {
		return avatarFiles;
	}
	public void setAvatarFiles(List<Avatar> avatarFiles) {
		this.avatarFiles = avatarFiles;
	}
	
	
	
}
