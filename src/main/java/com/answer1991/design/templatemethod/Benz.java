package com.answer1991.design.templatemethod;

public class Benz extends Car {
	@Override
	protected void engineStart() {
		System.out.println("Benz's engine  is starting");
	}
	
	@Override
	protected void start() {
		System.out.println("Benz is starting");
	}
	
	@Override
	protected void engineStop() {
		System.out.println("Benz's engine is stopping");
	}
	
	@Override
	protected void stop() {
		System.out.println("Benz is stopping");
	}
}
