package com.answer1991.design.command;

public class Invoker {
	public void action(Command command){
		command.execute();
	}
}
