package com.answer1991.design.prototype;

import org.junit.Before;
import org.junit.Test;

public class ClientTestConstructor {
	private TestConstructor testConstructor;
	
	@Before
	public void init(){
		this.testConstructor = new TestConstructor();
	}
	
	@Test
	public void test(){
		for(int i = 0; i < 5; i++){
			testConstructor.clone();
		}
	}
}
