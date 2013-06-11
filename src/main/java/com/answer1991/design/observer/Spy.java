package com.answer1991.design.observer;

import java.util.Observable;
import java.util.Observer;

public class Spy implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		System.out.println(o.hasChanged());
		Message m = (Message) arg;
		System.out.println(m.getInfo());
	}
}
