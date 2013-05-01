package com.answer1991.design.decorators;

public class Decorator implements SchoolReport {
	private SchoolReport beDecorated;
	
	public Decorator(SchoolReport beDecorated){
		this.beDecorated = beDecorated;
	}
	
	@Override
	public void report() {
		this.beDecorated.report();
	}
	
	@Override
	public void sign(String name) {
		this.beDecorated.sign(name);
	}
}
