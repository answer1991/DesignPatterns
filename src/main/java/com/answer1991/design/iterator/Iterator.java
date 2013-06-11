package com.answer1991.design.iterator;

public interface Iterator <E> {
	public abstract boolean hasNext();
	public abstract E next();
	public abstract void remove();
}
