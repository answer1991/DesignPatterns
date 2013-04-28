package com.answer1991.design.mediator;


public abstract class AbstractColleague {
	private AbstractMediator mediator;
	
	public AbstractMediator getMediator() {
		return mediator;
	}

	public void setMediator(AbstractMediator mediator) {
		this.mediator = mediator;
	}
}
