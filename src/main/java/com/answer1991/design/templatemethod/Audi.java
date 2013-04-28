package com.answer1991.design.templatemethod;

public class Audi extends Car{
	@Override
	protected void engineStart() {
		System.out.println("Audi's engine is starting");
	}
	@Override
	protected void start() {
		System.out.println("Audi is starting");
	}
	@Override
	protected void stop() {
		System.out.println("Audi is stopping");
	}
	@Override
	protected void engineStop() {
		System.out.println("Audi's engine is stopping");
	}
}
