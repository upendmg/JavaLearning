package com.zensar.synchronization;

public class Calculation extends Thread {
	int sum=0;
	public void run(){
		for(int i=1;i<=100;i++){
			sum=sum+i;
		
	}
	synchronized (this){
	notify();
}
}
}