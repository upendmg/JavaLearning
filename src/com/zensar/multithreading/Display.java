package com.zensar.multithreading;

public class Display {
	public synchronized void wish(String name){
		for(int i=1;i<=10;i++){
			System.out.println("Good Morning");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" "+name);
	

   }
}
}