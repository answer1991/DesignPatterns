package com.answer1991.design.decorators;

public enum EnumStrategy {
	BACK("back"){
		@Override
		public void execute() {
			System.out.println("后退");
		};
	},
	
	Forward("forward"){
		@Override
		public void execute() {
			System.out.println("向前");
		}
	};
	
	private String value;
	
	private EnumStrategy(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
	
	public abstract void execute();
}
