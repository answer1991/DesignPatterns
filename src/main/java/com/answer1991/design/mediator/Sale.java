package com.answer1991.design.mediator;

import java.util.Random;

public class Sale extends AbstractColleague {
	public static final String OFFSALE = "sale.offsale";
	public static final String SELL = "sale.sell";
	
	public void sell(int number){
		System.out.println("销售出" + number);
		super.getMediator().execute(SELL, number);
	}
	
	public void offsale(){
		super.getMediator().execute(OFFSALE);
	}
	
	public int getSellState(){
		Random r = new Random();
		int result =  r.nextInt(100);
		System.out.println("销售情况为：" + result);
		return result;
	}
}
