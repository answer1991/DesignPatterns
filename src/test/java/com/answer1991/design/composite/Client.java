package com.answer1991.design.composite;

import org.junit.Before;
import org.junit.Test;

public class Client {
	private Case case1;
	
	@Before
	public void init(){
		this.case1 = null;
	}
	
	@Test
	public void testSingle(){
		this.case1 = new Single();
		this.case1.something();
	}
	
	@Test
	public void testSuit(){
		Suit suit = new Suit();
		suit.add(new Single());
		suit.add(new Single());
		suit.add(new Single());
		suit.add(new Single());

		this.case1 = suit;
		this.case1.something();
	}
	
	@Test
	public void testComplex(){
		System.out.println("测试综合型的");
		Suit sub = new Suit();
		sub.add(new Single());
		sub.add(new Single());
		sub.add(new Single());
		sub.add(new Single());

		Suit suit = new Suit();
		suit.add(sub);
		suit.add(new Single());
		suit.add(new Single());
		suit.add(new Single());

		this.case1 = suit;
		this.case1.something();
	}
}
