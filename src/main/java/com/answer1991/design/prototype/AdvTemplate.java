package com.answer1991.design.prototype;

public class AdvTemplate {
	private String advSubject;
	private String advContext;
	
	public AdvTemplate(){
		this.advContext = "国庆买xx打7折";
		this.advSubject = "来自xx银行的关于国庆促销的广告";
	}

	public String getAdvSubject() {
		return advSubject;
	}

	public void setAdvSubject(String advSubject) {
		this.advSubject = advSubject;
	}

	public String getAdvContext() {
		return advContext;
	}

	public void setAdvContext(String advContext) {
		this.advContext = advContext;
	}
	
}
