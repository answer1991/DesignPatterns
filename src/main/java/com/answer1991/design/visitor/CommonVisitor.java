package com.answer1991.design.visitor;

public class CommonVisitor implements Visitor {
	@Override
	public void report(CommonEmployee employee) {
		System.out.println("这是CommonVisitor访问CommonEmployee后做的报告：");
		System.out.println("Employee name is " + employee.getName());
		System.out.println("Employee performance is " + employee.getPerformance());
	}
	
	@Override
	public void report(Leader leader) {
		System.out.println("这是CommonVisitor访问Leader后做的报告：");
		System.out.println("Leader name is " + leader.getName());
		System.out.println("Leader leadPerformance is " + leader.getLeaderPerformace());
	};
	
}
