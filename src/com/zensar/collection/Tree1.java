package com.zensar.collection;

import java.util.Collection;
import java.util.TreeSet;

public class Tree1 {
public static void main(String[] args) {
	Collection c=new TreeSet();
	c.add("Pune");
	c.add("Mumbai");
	c.add("Indore");
	c.add("indore");
	c.add("Punjab");
	System.out.println(c);
}
}
