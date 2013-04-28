package com.answer1991.design.mediator;

import org.junit.Before;
import org.junit.Test;

public class Client {
	private Stock stock;
	private Purchase purchase;
	private Sale sale;
	private AbstractMediator mediator;
	
	@Before
	public void init(){
		stock = new Stock();
		purchase = new Purchase();
		sale = new Sale();
		mediator = new Mediator(stock, purchase, sale);
		stock.setMediator(mediator);
		purchase.setMediator(mediator);
		sale.setMediator(mediator);
	}
	
	@Test
	public void test(){
		purchase.buy(10);
		
		sale.sell(150);

		stock.clearStock();
	}
}
