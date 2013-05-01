package com.answer1991.design.decorators;

public class ScoreShoolReport implements SchoolReport {
	@Override
	public void report() {
		System.out.println("这是您的成绩单： 数学70分，语文80分");
	}

	@Override
	public void sign(String name) {
		System.out.println("家长签字： " + name);
	}
}
