package com.answer1991.design.decorators;

public class HighestScoreDecorator extends Decorator {
	public HighestScoreDecorator(SchoolReport beDecorated) {
		super(beDecorated);
	}
	
	@Override
	public void report() {
		System.out.println("经过美化的-------》》 语文80分");
		super.report();
	}
	
	@Override
	public void sign(String name) {
		super.sign(name);
	}
}
