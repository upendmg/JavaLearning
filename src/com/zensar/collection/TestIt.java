package com.zensar.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIt {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		/*TestOb<String,Integer> t=new TestOb<String,Integer>("hey",5);
		t.setOb();
		n=t.getOb();
		*/
		
		al.add(34);
	
		Iterator<Integer> i=al.iterator();
		 int s= 0;
		 while(i.hasNext()){
		 s=(int)i.next();
			System.out.println(s);
			}
		
		
	}

}
