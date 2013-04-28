package com.answer1991.design.factory;

public abstract class AbstractCarFactory {
	public abstract <T extends Car> T createCar(Class<T> c);
}
