package com.answer1991.design.adapter;

import org.junit.Before;
import org.junit.Test;

public class Client {
	private IUserInfo userInfo;
	
	@Before
	public void init(){
		AdapterOutUserInfo adapterOutUserInfo = new AdapterOutUserInfo();
		adapterOutUserInfo.setLocation("外派的公司名称是xxx");
		adapterOutUserInfo.setOutAddress("外派公司所登记的地址");
		adapterOutUserInfo.setOutUsername("外派公司里的ID");
		adapterOutUserInfo.setAddress("重新登记的地址");
		adapterOutUserInfo.setUsername("重新登记的ID");
		
		userInfo = adapterOutUserInfo;
	}
	
	@Test
	public void test(){
		System.out.println(userInfo.getAddress());
		System.out.println(userInfo.getUserName());
	}
}
