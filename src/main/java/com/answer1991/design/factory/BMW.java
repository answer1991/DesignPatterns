package com.answer1991.design.factory;

public class BMW implements Car {
	@Override
	public void run() {
		System.out.println("BMW is Running");
	}
	
	@Override
	public void stop() {
		System.out.println("BMW is Stopping");
	};
}
