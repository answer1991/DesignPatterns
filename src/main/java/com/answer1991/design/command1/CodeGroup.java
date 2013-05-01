package com.answer1991.design.command1;

public class CodeGroup extends Group {
	@Override
	public void add() {
		System.out.println("代码组增加内容");
	}
	
	@Override
	public void change() {
		System.out.println("代码组修改内容");
	}
	
	@Override
	public void delete() {
		System.out.println("代码组删除内容");
	}

	@Override
	public void plan() {
		System.out.println("提出计划");
	};
	
	@Override
	public void rollback() {
		
	}
}
