package com.answer1991.design.mediator;

public abstract class AbstractMediator {
	protected Stock stock;
	protected Purchase purchase;
	protected Sale sale;
	
	public AbstractMediator(Stock stock, Purchase purchase, Sale sale){
		this.stock = stock;
		this.purchase = purchase;
		this.sale = sale;
	}
	
	public abstract void execute(String type, Object... objects); 
}
