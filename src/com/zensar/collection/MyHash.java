package com.zensar.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MyHash {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		Employee e1=new Employee(123,"upen",200);
		Employee e2=new Employee(176,"Ayush",2040);
		Employee e3=new Employee(111,"Tushar",1000);
		Employee e4=new Employee(123,"upen",200);
		Employee e5=new Employee(12,"naman",500);
		/*h.add(1);
		h.add(5);
		h.add(3);
		h.add(7);
		h.add(2);
		System.out.println(h);*/
		h.add(e1);
		h.add(e2);
		h.add(e3);
		h.add(e4);
		h.add(e5);
		System.out.println(h.hashCode());
		System.out.println(h);
	}

}
