package com.answer1991.design.composite;

import java.util.ArrayList;
import java.util.List;

public class Suit implements Case {
	List<Case> children;
	
	public Suit(){
		this.children = new ArrayList<Case>();
	}
	
	@Override
	public void something() {
		for(Case case1: children){
			case1.something();
		}
	}
	
	public void add(Case case1){
		this.children.add(case1);
	}
}
