package com.answer1991.design.adapter;

public class OuterUserInfo implements IOuterUserInfo {
	private String location;
	private String outAddress;
	private String outUsername;
	
	
	@Override
	public String getLocation() {
		return this.location;
	}

	@Override
	public String getOutAddress() {
		return this.outAddress;
	}

	@Override
	public String getOutUsername() {
		return this.outUsername;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setOutAddress(String outAddress) {
		this.outAddress = outAddress;
	}

	public void setOutUsername(String outUsername) {
		this.outUsername = outUsername;
	}
	
}
