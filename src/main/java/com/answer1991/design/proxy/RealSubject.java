package com.answer1991.design.proxy;

public class RealSubject implements Subject {

	@Override
	public void doSomething() {
		System.out.println("something did in RealSubject!");
	}

}
