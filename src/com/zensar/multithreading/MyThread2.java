package com.zensar.multithreading;

public class MyThread2 extends Thread {
	private Display d;
	private String name;
	public MyThread2(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run(){
		d.wish(name);
	}

}

