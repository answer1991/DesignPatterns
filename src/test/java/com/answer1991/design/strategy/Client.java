package com.answer1991.design.strategy;

import org.junit.Before;
import org.junit.Test;

public class Client {
	private Context context;

	@Before
	public void init() {
		this.context = new Context();
	}

	@Test
	public void test() {
		Strategy back = new BackStrategy();
		context.setStrategy(back);
		context.doSomething();

		Strategy forward = new ForwardStrategy();
		context.setStrategy(forward);
		context.doSomething();
	}
}
