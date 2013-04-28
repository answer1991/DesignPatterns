package com.answer1991.design.prototype;

/**
 * 测试构造函数不会被执行
 * @author zet
 *
 */
public class TestConstructor implements Cloneable {
	public TestConstructor(){
		System.out.println("构造函数被执行");
	}
	
	@Override
	public TestConstructor clone(){
		TestConstructor testConstructor = null;
		try {
			testConstructor = (TestConstructor) super.clone();
		} catch (Exception e){
			e.printStackTrace();
		}
		return testConstructor;
	}
}
