package com.zensar.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Hash1 {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(1);
		//h.add("ayush");
		//h.add("anshu");
		h.add(1);
		h.add(3);
		h.add(4);
		//h.add("upen");
		//h.add("Upen");
		System.out.println(h);
		//Collections.sort(h);
		 Iterator i=h.iterator();
		 int s= 0;
		 while(i.hasNext()){
		 s=(Integer)i.next();
			System.out.println(s);
			}



	}

}
