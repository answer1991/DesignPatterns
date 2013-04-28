package com.answer1991.design.abstractfactory;

public class AmericanCarFactory implements CarFactory{
	@Override
	public Benz createBenz() {
		return new AmericanBenz();
	}
	
	@Override
	public Audi createAudi() {
		return new AmericanAudi();
	}
}
