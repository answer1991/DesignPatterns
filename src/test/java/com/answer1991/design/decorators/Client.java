package com.answer1991.design.decorators;

import org.junit.Before;
import org.junit.Test;

public class Client {
	private SchoolReport report;
	
	@Before
	public void init(){
		this.report = new ScoreShoolReport();
	}
	
	@Test
	public void testHightestScore(){
		SchoolReport decorator = new HighestScoreDecorator(this.report);
		decorator.report();
		decorator.sign("陈先生");
	}
	
	@Test
	public void testRank(){
		SchoolReport decorator = new RankDecorator(this.report);
		decorator.report();
		decorator.sign("蒋女士");
	}
}
