package com.answer1991.design.factory;

import org.junit.Assert;
import org.junit.Test;

import com.answer1991.design.factory.BMW;
import com.answer1991.design.factory.Benz;
import com.answer1991.design.factory.SimpleCarFactory;

public class SimpleFactoryClient {
	@Test
	public void test(){
		Benz benz = SimpleCarFactory.createCar(Benz.class);
		BMW bmw = SimpleCarFactory.createCar(BMW.class);
		
		benz.run();
		benz.stop();
		
		bmw.run();
		bmw.stop();
		
		Assert.assertTrue(true);
	}
}
