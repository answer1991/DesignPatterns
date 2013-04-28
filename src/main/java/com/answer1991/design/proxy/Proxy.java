package com.answer1991.design.proxy;

public class Proxy implements Subject {
	private Subject subject = new RealSubject();
	
	@Override
	public void doSomething() {
		System.out.println("something did in Proxy before Subject");
		this.subject.doSomething();
		System.out.println("something did in Proxy after Subject");
	}
}
