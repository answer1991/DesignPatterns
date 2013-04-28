package com.answer1991.design.mediator;

/**
 * 库存类
 * 
 * @author zet
 *
 */

public class Stock extends AbstractColleague {
	public static final String CLEAR = "stock.clear";
	
	private int computerNumber = 100;
	
	public int getComputerNumber(){
		return this.computerNumber;
	}
	
	public void increate(int number){
		this.computerNumber += number;
		this.printComputerNumber();
	}
	
	public void decreate(int number){
		this.computerNumber -= number;
		this.printComputerNumber();
	}
	
	public void printComputerNumber(){
		System.out.println("库存数量为:" + this.computerNumber);
	}
	
	public void clearStock(){
		System.out.println("清理存货数量为： " + this.computerNumber);
		super.getMediator().execute(Stock.CLEAR);
	}
}
