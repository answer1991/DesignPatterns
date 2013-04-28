package com.answer1991.design.abstractfactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Client {
	private CarFactory chineseFactory;
	private CarFactory americanFactory;
	
	@Before
	public void init(){
		chineseFactory = new ChineseCarFactory();
		americanFactory = new AmericanCarFactory();
	}
	
	@Test
	public void test(){
		Benz chineseBenz = chineseFactory.createBenz();
		Audi chineseAudi = chineseFactory.createAudi();
		
		Benz americanBenz = americanFactory.createBenz();
		Audi americanAudi = americanFactory.createAudi();
		
		Assert.assertEquals(CarLocation.CHINESE_CAR, chineseBenz.getLocation());
		Assert.assertEquals(CarLocation.CHINESE_CAR, chineseAudi.getLocation());
		
		Assert.assertEquals(CarLocation.AMERICAN_CAR, americanBenz.getLocation());
		Assert.assertEquals(CarLocation.AMERICAN_CAR, americanAudi.getLocation());
	}
}
