package com.answer1991.design.chain;

import org.junit.Before;
import org.junit.Test;

public class Client {
	private Handler handler;
	
	@Before
	public void init(){
		handler = new Handler();
		handler.registerHandler(new RequestHandler(1));
		handler.registerHandler(new RequestHandler(2));
		handler.registerHandler(new RequestHandler(3));
	}
	
	@Test
	public void test1(){
		Request request = new Request(1);
		String result = handler.handle(request);
		System.out.println(result);
	}
	
	@Test
	public void test2(){
		Request request = new Request(2);
		String result = handler.handle(request);
		System.out.println(result);
	}
}
