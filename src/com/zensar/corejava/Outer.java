package com.zensar.corejava;


public class Outer {
	//private int a=4;
	public void display(){
		//System.out.println(a);
		class Inner{
			int b=6;
			public void test(){
			System.out.println(b);
			}
					}
		Inner inner=new Inner();
		inner.test();
 
	}
	/*
	public static class Inner{
		int b=6;
		public void display(){
		System.out.println(a);
		System.out.println(b);
	}
	}*/
	
}
