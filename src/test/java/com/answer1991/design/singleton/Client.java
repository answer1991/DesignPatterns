package com.answer1991.design.singleton;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Client {
	private Singleton singleton = null;
	
	@Before
	public void init(){
		singleton = Singleton.getInstance();
	}
	
	@Test
	public void test(){
		singleton.saySomething();
		Assert.assertTrue(true);
	}
}
