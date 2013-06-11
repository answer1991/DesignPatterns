package com.answer1991.design.visitor;

public interface Visitor {
	public abstract void report(CommonEmployee employee);
	public abstract void report(Leader leader);
}
