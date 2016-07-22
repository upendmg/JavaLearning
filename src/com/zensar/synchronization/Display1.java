package com.zensar.synchronization;

public class Display1 {

	public static synchronized  void displayNumber(){
		for(int i=1;i<=10;i++)
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public  void displayCharacter(){
		for(int i=65;i<=75;i++)
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
}
