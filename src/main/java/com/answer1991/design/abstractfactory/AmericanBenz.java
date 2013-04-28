package com.answer1991.design.abstractfactory;

/**
 * 美国产的Benz。
 * @author zet
 *
 */
public class AmericanBenz extends Benz{
	@Override
	public String getLocation() {
		return AMERICAN_CAR;
	}
}
