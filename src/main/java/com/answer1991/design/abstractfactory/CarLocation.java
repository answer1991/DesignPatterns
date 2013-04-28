package com.answer1991.design.abstractfactory;

/**
 * Car的生产地。
 * @author zet
 *
 */
public interface CarLocation {
	public static final String CHINESE_CAR = "China";
	public static final String AMERICAN_CAR = "America";
	public abstract String getLocation();
}
