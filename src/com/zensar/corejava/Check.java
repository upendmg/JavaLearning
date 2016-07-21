package com.zensar.corejava;

/**
 * @author UPEN
 *
 */
public class Check {

	public static void main(String args[]){
		Outer out=new Outer();
		//Outer.Inner inner=out.new Inner();
		//Outer .Inner inner=new Outer.Inner();
		//inner.display();
		System.out.println("\"hi\"");
		out.display();
	}
}
