package com.answer1991.design.abstractfactory;

/**
 * 代表Benz车，抽象类，生产地未定。
 * @author zet
 *
 */
public abstract class Benz extends Car{
	@Override
	public void run() {
		System.out.println("Benz is running");
	}
	@Override
	public void start() {
		System.out.println("Benz is starting");
	}
	@Override
	public void stop() {
		System.out.println("Benz is stopping");
	}
}
