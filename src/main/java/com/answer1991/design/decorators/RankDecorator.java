package com.answer1991.design.decorators;

public class RankDecorator extends Decorator{
	public RankDecorator(SchoolReport beDecorated){
		super(beDecorated);
	}
	
	@Override
	public void report() {
		System.out.println("经过美化的--->班级排名是10名");
		super.report();
	}
}
