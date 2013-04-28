package com.answer1991.design.abstractfactory;

/**
 * 位于中国的汽车工厂。
 * @author zet
 *
 */
public class ChineseCarFactory implements CarFactory {

	@Override
	public Benz createBenz() {
		return new ChineseBenz();
	}

	@Override
	public Audi createAudi() {
		return new ChineseAudi();
	}

}
