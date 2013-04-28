package com.answer1991.design.abstractfactory;

/**
 * 美国生产的Audi。
 * @author zet
 *
 */
public class AmericanAudi extends Audi {
	@Override
	public String getLocation() {
		return AMERICAN_CAR;
	}
}
