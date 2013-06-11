package com.answer1991.design.facade;

import org.junit.Before;
import org.junit.Test;

public class Client {
	private ISubSystemFacade facade;
	
	@Before
	public void init(){
		SubSystemFacade facade = new SubSystemFacade();
		facade.setSubSystem1(new SubSystem1());
		facade.setSubSystem2(new SubSystem2());
		facade.setSubSystem3(new SubSystem3());
		this.facade = facade;
	}
	
	@Test
	public void test(){
		this.facade.doSomething1();
		this.facade.doSomething2();
		this.facade.doSomething3();
	}
}
