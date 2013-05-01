package com.answer1991.design.command1;

public class Invoker {
	public void invokeCommand(Command command){
		command.execute();
	}
}
