package com.answer1991.design.adapter;

public class UserInfo implements IUserInfo {
	private String username;
	private String address;
	
	@Override
	public String getUserName() {
		return this.username;
	}

	@Override
	public String getAddress() {
		return this.address;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
