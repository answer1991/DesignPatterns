package com.answer1991.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectHandler implements InvocationHandler {
	private Subject subject;
	
	public SubjectHandler(Subject subject){
		this.subject = subject;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		System.out.println("something did before invoke RealSubject!");
		result = method.invoke(subject, args);
		System.out.println("something did after invoke RealSubject");
		return result;
	}
}
