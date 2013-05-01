package com.answer1991.design.command1;

public class RequireGroup extends Group {

	@Override
	public void add() {
		System.out.println("需求组增加内容");
	}

	@Override
	public void delete() {
		System.out.println("需求组删除内容");
	}

	@Override
	public void change() {
		System.out.println("需求组修改内容");
	}

	@Override
	public void plan() {
		System.out.println("需求组提出内容");
	}

	@Override
	public void rollback() {
		
	}

}
