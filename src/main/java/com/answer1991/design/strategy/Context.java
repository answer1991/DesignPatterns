package com.answer1991.design.strategy;

public class Context {
	private Strategy strategy;

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void doSomething() {
		this.strategy.execute();
	}
}