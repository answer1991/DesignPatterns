package com.answer1991.design.factory;

public class Benz implements Car {
	@Override
	public void run() {
		System.out.println("Benz is Running");
	}
	
	 @Override
	public void stop() {
		System.out.println("Benz is Stopping");
	}
}
