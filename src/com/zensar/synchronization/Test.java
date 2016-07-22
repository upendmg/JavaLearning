package com.zensar.synchronization;


public class Test extends Thread {
	public static void main(String[] args) {
		Display1 d=new Display1();
		Display1 d1=new Display1();
		Mythread1 mt1=new Mythread1(d);
		Mythread2 mt2=new Mythread2(d1);
		mt1.start();
		mt2.start();
		
	}

}
