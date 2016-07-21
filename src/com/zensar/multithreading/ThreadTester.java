package com.zensar.multithreading;

public class ThreadTester {
	public static void main(String[] args) {
		
		RunThread1 rt=new RunThread1("t1");
		RunThread1 rt2=new RunThread1("t2");
		Thread tr=new Thread(rt);
		Thread tr2=new Thread(rt2);
		
		
		
		
		System.out.println("hey");
		tr.start();
		tr2.start();
		System.out.println("hello");
	}

}
