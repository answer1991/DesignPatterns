package com.answer1991.design.iterator;

import org.junit.Before;
import org.junit.Test;

public class Client {
	private Set<String> set;
	
	@Before
	public void init(){
		this.set = new Set<String>();
	}
	
	@Test
	public void test(){
		for(int i = 0; i < 20; i++){
			set.add("String  " + i);
		}
		
		for(Iterator<String> iterator = set.iterator(); iterator.hasNext(); ){
			System.out.println(iterator.next());
		}
	}
}
