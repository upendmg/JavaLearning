package com.zensar.synchronization;

public class Mythread2 extends Thread {
	private Display1 d;

	public Mythread2(Display1 d) {
		this.d = d;
	}
	public void run(){
		d.displayCharacter();
	}

}


