package com.answer1991.design.chain;

public class RequestHandler {
	private RequestHandler next;
	private int type;
	
	public RequestHandler(int type){
		this.type = type;
	}
	
	public RequestHandler(int type, RequestHandler next){
		this.type = type;
		this.next = next;
	}
	
	public RequestHandler next(){
		return this.next;
	}
	
	public void setNext(RequestHandler next){
		this.next = next;
	}
	
	public String handle(Request request){
		if(request.getType() == this.type){
			return "来自type为" + type + "的处理结果： 成功";
		}
		else {
			if(this.next() != null){
				return this.next().handle(request);
			}
			else {
				return "无处理结果";
			}
		}
	}
}
