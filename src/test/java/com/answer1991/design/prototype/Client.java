package com.answer1991.design.prototype;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class Client {
	private Mail mailProto;
	private AdvTemplate advTemplate;

	@Before
	public void init(){
		this.advTemplate = new AdvTemplate();
		this.mailProto = new Mail(this.advTemplate);
	}
	
	@Test
	public void test(){
		for(int i = 0; i < 100; i ++){
			Mail cloneMail = mailProto.clone();
			cloneMail.setAppellation(getRandomString(5) + "先生/女士");
			cloneMail.setReveivcer(getRandomString(10) + "@gmail.com");
			cloneMail.send();
		}
	}
	
	public static final String FULL_CHARACTER = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final int FULL_CHARACHER_LENGTH = FULL_CHARACTER.length();
	
	public static String getRandomString(int strLength){
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < strLength; i ++){
			sb.append(FULL_CHARACTER.charAt(random.nextInt(FULL_CHARACHER_LENGTH)));
		}
		return sb.toString();
	}
}
