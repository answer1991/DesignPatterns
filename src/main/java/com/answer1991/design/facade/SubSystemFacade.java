package com.answer1991.design.facade;

public class SubSystemFacade implements ISubSystemFacade {
	private ISubSystem1 subSystem1;
	private ISubSystem2 subSystem2;
	private ISubSystem3 subSystem3;
	
	@Override
	public void doSomething1() {
		subSystem1.doSomething1();
	}
	
	@Override
	public void doSomething2() {
		subSystem2.doSomething2();
	};
	
	@Override
	public void doSomething3() {
		subSystem3.doSomething3();
	}

	public ISubSystem1 getSubSystem1() {
		return subSystem1;
	}

	public void setSubSystem1(ISubSystem1 subSystem1) {
		this.subSystem1 = subSystem1;
	}

	public ISubSystem2 getSubSystem2() {
		return subSystem2;
	}

	public void setSubSystem2(ISubSystem2 subSystem2) {
		this.subSystem2 = subSystem2;
	}

	public ISubSystem3 getSubSystem3() {
		return subSystem3;
	}

	public void setSubSystem3(ISubSystem3 subSystem3) {
		this.subSystem3 = subSystem3;
	}
}
