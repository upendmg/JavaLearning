package com.zensar.multithreading;

public class Test2 {
	public static void main(String[] args) {
		Display d1= new Display();
		//Display d2= new Display();
		MyThread2 mt1=new MyThread2(d1,"Dhoni");
		MyThread2 mt2=new MyThread2(d1,"Virat");
		mt1.start();
		mt2.start();
	}

}
