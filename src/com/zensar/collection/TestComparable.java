package com.zensar.collection;

import java.util.Set;
import java.util.TreeSet;

public class TestComparable {
	public static void main(String[] args) {
		Set s= new TreeSet();
		Employee e1= new Employee(1, "ayush", 1000);
		Employee e2= new Employee(1, "ayush", 1000);
		Employee e3 = new Employee(2, "sachin", 10000);
		Employee e4 = new Employee(3, "rahul", 100);
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		for(Object e:s)
		System.out.println(e);
	}

}

