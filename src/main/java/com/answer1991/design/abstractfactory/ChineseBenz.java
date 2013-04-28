package com.answer1991.design.abstractfactory;

/**
 * 中国生产的Benz。
 * @author zet
 *
 */
public class ChineseBenz extends Benz{
	@Override
	public String getLocation() {
		return CHINESE_CAR;	
	}
}
