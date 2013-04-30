package com.answer1991.design.prototype;

/**
 * clone方法的原理是从内存以二进制流的方式进行拷贝的，不会执行构造函数。
 * clone方法拷贝都是潜拷贝，如需要深拷贝则需要对每个成员进行clone之后再赋值。
 * clone方法不能被final的引用执行。
 * 
 * @author zet
 *
 */
public class Mail implements Cloneable {
	private String reveivcer;
	private String subject;
	private String appellation;
	private String context;
	private String tail;
	
	public Mail(){
		
	}

	public Mail(AdvTemplate advTemplate) {
		this.subject = advTemplate.getAdvSubject();
		this.context = advTemplate.getAdvContext();
	}

	public void send() {
		System.out.println("已经将邮件发送给:" + this.appellation + "，邮件地址为:"
				+ this.reveivcer + "， 邮件主题:" + this.subject + ", 邮件内容:"
				+ this.context);
	}

	public String getReveivcer() {
		return reveivcer;
	}

	public void setReveivcer(String reveivcer) {
		this.reveivcer = reveivcer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAppellation() {
		return appellation;
	}

	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}

	@Override
	public Mail clone() {
		Mail mail = null;
		try {
			mail = (Mail) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mail;
	}
}
