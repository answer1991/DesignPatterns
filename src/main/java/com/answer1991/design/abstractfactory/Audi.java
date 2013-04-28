package com.answer1991.design.abstractfactory;
/**
 * 代表Audi车，抽象类，生产地未定。
 * @author zet
 *
 */
public abstract class Audi extends Car{
	@Override
	public void run() {
		System.out.println("Audi is running");
	}
	
	@Override
	public void start() {
		System.out.println("Audi is starting");
	}
	
	@Override
	public void stop() {
		System.out.println("Audi is stopping");
	}
}
