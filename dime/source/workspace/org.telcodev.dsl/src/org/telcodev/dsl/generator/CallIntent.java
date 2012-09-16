package org.telcodev.dsl.generator;
import org.telcodev.dsl.dime.ConcatenationExpression;

public class CallIntent {
	private ConcatenationExpression called;
	private String next;
	
	public ConcatenationExpression getCalled() {
		return called;
	}
	public void setCalled(ConcatenationExpression called) {
		this.called = called;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public CallIntent(ConcatenationExpression called, String next) {
		super();
		this.called = called;
		this.next = next;
	}
	
	
	
	
	
	
	
	
}
