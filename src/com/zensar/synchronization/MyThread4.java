package com.zensar.synchronization;

public class MyThread4 {
public static void main(String[] args) {
	System.out.println("main thread");
	Calculation c=new Calculation();
	c.start();
	try {
		//Thread.sleep(1000);
		synchronized (c){
			c.wait();
		}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(c.sum);
	
}
}
