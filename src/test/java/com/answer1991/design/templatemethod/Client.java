package com.answer1991.design.templatemethod;

import org.junit.Test;

public class Client {
	@Test
	public void testBenz(){
		Car benz = new Benz();
		benz.run();
	}
	
	@Test
	public void testAudi(){
		Car audi = new Audi();
		audi.run();
	}
}
