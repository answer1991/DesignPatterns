package com.answer1991.design.abstractfactory;

/**
 * 中国生产的Audi。
 * @author zet
 *
 */
public class ChineseAudi extends Audi {
	@Override
	public String getLocation() {
		return CHINESE_CAR;
	}
}
