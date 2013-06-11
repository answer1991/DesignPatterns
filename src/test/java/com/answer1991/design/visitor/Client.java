package com.answer1991.design.visitor;

import org.junit.Before;
import org.junit.Test;

public class Client {
	private Visitor visitor;
	private Leader leader;
	private CommonEmployee employee;
	
	@Before
	public void init(){
		this.visitor = new CommonVisitor();
		
		this.leader = new Leader();
		this.leader.setName("领导A");
		this.leader.setLeaderPerformace("领导的很好");
		
		this.employee = new CommonEmployee();
		this.employee.setName("普通员工A");
		this.employee.setPerformance("工作表现的很好");
	}
	
	@Test
	public void testVisitLeader(){
		this.leader.accept(this.visitor);
	}
	
	@Test
	public void testVisitEmployee(){
		this.employee.accept(this.visitor);
	}
}
