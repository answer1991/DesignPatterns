package com.answer1991.design.proxy;

import java.lang.reflect.InvocationHandler;

import org.junit.Test;

public class DynamicClient {
	@Test
	public void test(){
		Subject subject = new RealSubject();
		InvocationHandler handler = new SubjectHandler(subject);
		
		Subject proxy = (Subject) java.lang.reflect.Proxy.newProxyInstance(this.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
		
		proxy.doSomething();
		System.out.println(proxy.getClass());
	}
}
