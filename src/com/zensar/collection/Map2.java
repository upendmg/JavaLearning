package com.zensar.collection;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map2 {
public static void main(String[] args) {
	Map m=new TreeMap();
	m.put("name","upen");
	m.put("age", 21);
	m.put("salary",2000);
	Set s=m.keySet();
	Iterator i=s.iterator();
	String key=null;
	while(i.hasNext()){
		key=(String)i.next();
		System.out.println("key is-->>"+key +" "+"value is "+m.get(key));
	}
	
	System.out.println(m);
	
}
}