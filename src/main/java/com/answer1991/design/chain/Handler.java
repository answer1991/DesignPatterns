package com.answer1991.design.chain;

import java.util.ArrayList;
import java.util.List;

public class Handler {
	private List<RequestHandler> chain = new ArrayList<RequestHandler>();
	
	public void registerHandler(RequestHandler handler){
		if(chain.size() == 0) {
			chain.add(handler);
		}
		else {
			chain.get(chain.size() - 1).setNext(handler);
			chain.add(handler);
		}
	}
	
	public String handle(Request request){
		return chain.get(0).handle(request);
	}
}
