package com.zensar.multithreading;

public class RunThread1 implements Runnable {
    Thread t1;
    public RunThread1(String name){
    	t1=new Thread(this,name);
    	t1.start();
    	
    	
    }
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("HI");
		System.out.println("bye"+Thread.currentThread().getName());
		
	}
	

	
	

}
