package com.answer1991.design.factory;

/**
 * 这种实现方法不是很好。
 * 因为扩充子类就要重写生产的方法。
 * @author zet
 *
 */
public class CarFactoryEnum extends AbstractCarFactory2 {

	@Override
	public Car createCar(CarType type) {
		Car car = null;
		switch(type){
		case BENZ:
			car = new Benz();
			break;
		case BMW:	
			car = new BMW();
			break;
		default:
			break;
		}
		return car;
	}

}
