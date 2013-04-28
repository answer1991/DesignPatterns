package com.answer1991.design.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.answer1991.design.factory.AbstractCarFactory2;
import com.answer1991.design.factory.BMW;
import com.answer1991.design.factory.Benz;
import com.answer1991.design.factory.CarFactoryEnum;
import com.answer1991.design.factory.CarType;

public class Client2 {
	private AbstractCarFactory2 factory = null;
	
	@Before
	public void init(){
		factory = new CarFactoryEnum();
	}
	
	@Test
	public void test(){
		Benz benz = (Benz) factory.createCar(CarType.BENZ);
		BMW bmw = (BMW) factory.createCar(CarType.BMW);
		
		benz.run();
		benz.stop();
		
		bmw.run();
		bmw.stop();
		
		Assert.assertTrue(true);
	}
}
