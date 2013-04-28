package com.answer1991.design.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.answer1991.design.factory.AbstractCarFactory;
import com.answer1991.design.factory.BMW;
import com.answer1991.design.factory.Benz;
import com.answer1991.design.factory.Car;
import com.answer1991.design.factory.CarFactory;

public class Client {
	private AbstractCarFactory factory = null;
	
	@Before
	public void init(){
		factory = new CarFactory();
	}
	
	@Test
	public void test(){
		Car benz = factory.createCar(Benz.class);
		Car bmw = factory.createCar(BMW.class);
		
		benz.run();
		benz.stop();
		
		bmw.run();
		bmw.stop();
		
		Assert.assertTrue(true);
	}
}
