package com.answer1991.design.command1;

import org.junit.Before;
import org.junit.Test;

public class Client {
	private Group codeGroup;
	private Group pageGroup;
	private Group requireGroup;
	private Invoker invoker;
	
	@Before
	public void init(){
		this.codeGroup = new CodeGroup();
		this.pageGroup = new PageGroup();
		this.requireGroup = new RequireGroup();
		this.invoker = new Invoker();
	}
	
	@Test
	public void testAdd(){
		Command pageAddCommand = new AddCommand(this.pageGroup);
		this.invoker.invokeCommand(pageAddCommand);
		
		Command codeAddCommand = new AddCommand(this.codeGroup);
		this.invoker.invokeCommand(codeAddCommand);
		
		Command requireAddCommand = new AddCommand(this.requireGroup);
		this.invoker.invokeCommand(requireAddCommand);
	}
}
