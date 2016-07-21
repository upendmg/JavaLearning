package com.zensar.collection;

import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class MapTest {
	public static void main(String[] args) {
	//	Map m= new TreeMap();
		Map m=new HashMap();
		Map m1=new TreeMap(m);
		/*m.put("age", 19);
		m.put("Salary", 1000);
		m.put("Name","Ayush");*/
		
		//m1.put(new Student(1, "ayush"), new Certification("os"));

		/*m1.put(new Student(1, "ayush"), new Certification("os"));

		m1.put(new Student(2, "sachin"), new Certification("sjp"));

		m1.put(new Student(3, "rahul"), new Certification("orac"));
*/		m1.put("name",1|3|4);
		System.out.println(m1);
		
	 	Set s= m.keySet();
		
		
		for(Object o:s)
			System.out.println("key is" +o+ "value is"+m.get(o));
		
		
		
		
		

		/*String key=null;
		System.out.println(key);*/
		/*Iterator i= s.iterator();
		while(i.hasNext()){
			key =(String)i.next();
			System.out.println("key is "+key+"  value is "+m.get(key));
		}*/
		
		
		
		
		//System.out.println(m);
		
	}

	

}
