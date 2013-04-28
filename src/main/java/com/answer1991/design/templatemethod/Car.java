package com.answer1991.design.templatemethod;

public abstract class Car {
	protected abstract void start();
	protected abstract void stop();
	protected abstract void engineStart();
	protected abstract void engineStop();
	
	public void run(){
		engineStart();
		start();
		engineStop();
		stop();
	}
}
