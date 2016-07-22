package com.zensar.synchronization;

public class Mythread1 extends Thread {
	private Display1 d;

	public Mythread1(Display1 d) {
		this.d = d;
	}
	public void run(){
		d.displayNumber();
	}

}
