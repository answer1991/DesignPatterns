package com.answer1991.design.mediator;

public class Mediator extends AbstractMediator {
	public Mediator(Stock stock, Purchase purchase, Sale sale) {
		super(stock, purchase, sale);
	}
	
	@Override
	public void execute(String type, Object... objects) {
		if(Stock.CLEAR.equals(type)){
			this.clear();
		} else if (Purchase.BUY.equals(type)){
			this.buy( (Integer) objects[0]);
		} else if (Sale.OFFSALE.equals(type)){
			this.offSell();
		} else if (Sale.SELL.equals(type)){
			this.sell( (Integer) objects[0]);
		}
	}
	
	//采购
	private void buy(int number){
		int saleStates = super.sale.getSellState();
		int buyNumber = number;
		if(saleStates > 80){
			System.out.println("销售良好，全部采购:" + buyNumber);
		}
		else {
			buyNumber = buyNumber / 2;
			System.out.println("销售情况不理想，采购一半:" + buyNumber);
		}
		this.stock.increate(buyNumber);
		System.out.println();
	}
	
	//销售
	private void sell(int number) {
		while(number > this.stock.getComputerNumber()){
			System.out.println("仓库存货不足，先进行采购");
			super.purchase.buy(number - this.stock.getComputerNumber());
		}
		this.stock.decreate(number);
		System.out.println();
	}
	
	private void offSell(){
		System.out.println("折价促销!");
		System.out.println();
	}
	
	private void clear(){
		System.out.println("清仓促销!");
		super.purchase.refuseBuy();
		System.out.println();
	}
}
