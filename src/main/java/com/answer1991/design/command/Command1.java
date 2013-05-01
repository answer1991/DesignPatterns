package com.answer1991.design.command;

public class Command1 extends Command {
	private Receiver receiver;
	
	public Command1(Receiver receiver){
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		this.receiver.execute();
	}
}
