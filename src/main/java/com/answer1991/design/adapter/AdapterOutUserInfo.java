package com.answer1991.design.adapter;

public class AdapterOutUserInfo extends OuterUserInfo implements IUserInfo{
	private String address;
	private String username;
	
	@Override
	public String getAddress() {
		return this.address;
	}
	
	@Override
	public String getUserName() {
		return this.username;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
