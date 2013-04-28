package com.answer1991.design.mediator;

public class Purchase extends AbstractColleague {
	public static final String BUY = "purchase.buy";
	
	public void buy(int number){
		System.out.println("计划采购：" + number);
		super.getMediator().execute(BUY, number);
	}
	
	public void refuseBuy(){
		System.out.println("拒绝采购");
	}
}
