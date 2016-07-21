package com.zensar.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Test2 {
	public static void main(String[] args) {
	    Vector v=new Vector();
		v.add("punjab");
		v.add("pune");
		v.add("Delhi");
		v.add("Haryana");
		v.add("Lucknow");
		 Collections.sort(v);
		 Iterator i=v.iterator();
		 String s= null;
		 while(i.hasNext()){
		    s=(String)i.next();
			System.out.println(s);
			}

}
}