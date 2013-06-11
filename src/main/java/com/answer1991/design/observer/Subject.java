package com.answer1991.design.observer;

import java.util.Observable;

public class Subject extends Observable {
	public void doSomething(){
		System.out.println("这个方法将会被观察");
		
		Message m = new Message();
		m.setInfo("被观察者的状态发生改变");
		
		super.setChanged();
		super.notifyObservers(m);
	}
}
