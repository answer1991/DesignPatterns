package com.answer1991.design.abstractfactory;

/**
 * 抽象工厂。
 * @author zet
 *
 */
public interface CarFactory {
	public abstract Benz createBenz();
	public abstract Audi createAudi();
}
