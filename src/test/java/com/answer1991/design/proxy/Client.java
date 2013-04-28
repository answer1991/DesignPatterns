package com.answer1991.design.proxy;

import org.junit.Before;
import org.junit.Test;

public class Client {
	private Proxy proxy;
	
	@Before
	public void init(){
		this.proxy = new Proxy();
	}
	
	@Test
	public void test(){
		this.proxy.doSomething();
	}
}
