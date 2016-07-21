package com.zensar.collection;

public class TestOb<T> {
	private T ob;

	public TestOb() {
		super();
	}

	public TestOb(T ob) {
		super();
		this.ob = ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}

	public T getOb() {
		return ob;
	}
	

}
