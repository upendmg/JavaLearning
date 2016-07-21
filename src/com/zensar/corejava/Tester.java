package com.zensar.corejava;

public class Tester {
	public static void main (String args[]){
		/*Circle c = new Circle();
		System.out.println(c.Area());
		Rectangle r = new Rectangle();
		System.out.println(r.Area());*/
		Shapeable shape[] = new Shapeable[5]; 
		shape[0] = new Circle();
		shape[1] = new Circle(5);
		shape[2] = new Rectangle();
		shape[3] = new Rectangle(5, 6);
		shape[4] = new Rectangle(5, 5);
		for (int i = 0; i < shape.length; i++) {
			System.out.println(shape[i].Area());
		}
    
	}

}
