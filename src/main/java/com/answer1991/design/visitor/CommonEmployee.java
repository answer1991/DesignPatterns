package com.answer1991.design.visitor;

public class CommonEmployee implements BeVisited {
	private String name;
	private String performance;
	
	@Override
	public void accept(Visitor visitor) {
		visitor.report(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}
}
