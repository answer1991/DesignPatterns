package com.answer1991.design.command1;

public class AddCommand extends Command {
	private Group group;
	
	public AddCommand(Group group){
		this.group = group;
	}
	
	@Override
	public void execute() {
		this.group.add();
	}
}
