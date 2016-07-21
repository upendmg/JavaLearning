package com.zensar.multithreading;

public class MyThread extends Thread{
	public void run(){
		if (MyThread.currentThread().getName().equals("mythread")){
			for(int i=1;i<=10;i++)
			System.out.println("ram");
		}
		if (MyThread.currentThread().getName().equals("mythread2")){
			for(int i=1;i<=10;i++)
			System.out.println("Seeta");
		}
	
	//System.out.println("ram");
	
	}
	

}
