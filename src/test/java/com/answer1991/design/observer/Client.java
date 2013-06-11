package com.answer1991.design.observer;

import org.junit.Before;
import org.junit.Test;

public class Client {
	private Subject observable;
	
	@Before
	public void init(){
		observable = new Subject();
		observable.addObserver(new Spy());
		observable.addObserver(new Spy());
		observable.addObserver(new Spy());
		observable.addObserver(new Spy());
		observable.addObserver(new Spy());
	}
	
	@Test
	public void testDoSomething(){
		observable.doSomething();
	}
}
