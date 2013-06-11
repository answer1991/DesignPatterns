package com.answer1991.design.visitor;

public class Leader implements BeVisited {
	private String name;
	private String leaderPerformace;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLeaderPerformace() {
		return leaderPerformace;
	}
	public void setLeaderPerformace(String leaderPerformace) {
		this.leaderPerformace = leaderPerformace;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.report(this);
	}
}
