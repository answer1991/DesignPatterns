package com.answer1991.design.command;

import org.junit.Before;
import org.junit.Test;

public class Client {
	private Invoker invoker;
	
	@Before
	public void init(){
		this.invoker = new Invoker();
	}
	
	@Test
	public void test(){
		Receiver receiver1 = new Receiver1();
		Command command1 = new Command1(receiver1);
		this.invoker.action(command1);
	}
}
