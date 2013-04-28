package com.answer1991.design.factory;

public class CarFactory extends AbstractCarFactory {
	@SuppressWarnings("unchecked")
	@Override
	public <T extends Car> T createCar(Class<T> c) {
		Car car = null;
		try{
			car = (Car) Class.forName(c.getName()).newInstance();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			
		}
		return (T) car;
	}
}
