package com.answer1991.design.factory;

public class SimpleCarFactory {
	@SuppressWarnings("unchecked")
	public static <T extends Car> T createCar(Class<T> c){
		Car car = null;
		try{
			System.out.println(c.getName());
			car = (Car) Class.forName(c.getName()).newInstance();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return (T) car;
	}
}
