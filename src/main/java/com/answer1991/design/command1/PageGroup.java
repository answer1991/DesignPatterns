package com.answer1991.design.command1;

public class PageGroup extends Group {
	@Override
	public void add() {
		System.out.println("页面组增加内容");
	}
	
	@Override
	public void change() {
		System.out.println("页面组修改内容");
	}
	
	@Override
	public void delete() {
		System.out.println("页面组删除内容");
	}
	
	@Override
	public void plan() {
		System.out.println("页面组提出计划");
	}
	
	@Override
	public void rollback() {
		
	};
}
