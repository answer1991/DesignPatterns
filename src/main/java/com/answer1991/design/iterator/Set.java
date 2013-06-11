package com.answer1991.design.iterator;

public class Set<E> {
	public Object[] elements;
	private int size = 0;
	
	public Set(){
		this.elements = new Object[10];
	}
	
	public Set(int size){
		this.elements = new Object[size];
	}
	
	public Iterator<E> iterator(){
		return new Itr();
	}
	
	public void add(E e){
		if(this.size == this.elements.length){
			Object[] newBuffer = new Object[this.elements.length + 5];
			for(int i = 0; i < this.elements.length; i ++){
				newBuffer[i] = this.elements[i];
			}
			this.elements = newBuffer;
		}
		this.elements[this.size] = e;
		this.size ++;
	}
	
	private class Itr implements Iterator<E> {
		private int corsur;
		@Override
		public boolean hasNext() {
			return corsur < size;
		}

		@SuppressWarnings("unchecked")
		@Override
		public E next() {
			if(this.corsur >= size){
				return null;
			}
			return (E) elements[corsur ++];
		}

		@Override
		public void remove() {
			
		}
	}
}
