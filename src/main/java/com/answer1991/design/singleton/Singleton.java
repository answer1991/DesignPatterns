package com.answer1991.design.singleton;

/**
 * 单例模式。
 * 被单例的对象只能通过该类的一个静态方法获得其唯一的实例化对象。
 * @author zet
 *
 */
public class Singleton {
	private static final Singleton singleton = new Singleton();
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return singleton;
	}
	
	public void saySomething(){
		System.out.println("hello world");
	}
}
