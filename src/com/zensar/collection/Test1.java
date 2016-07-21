package com.zensar.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Test1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("punjab");
		al.add("pune");
		al.add("Delhi");
		al.add("Haryana");
		al.add("Lucknow");
		//al.remove("delhi");
		// System.out.println(al.contains("pune"));
		//System.out.println(al);
		Collections.sort(al);
		for(Object o:al)
			System.out.println(o);
		//for(int i=0;i<al.size();i++)
			//System.out.println(al.get(i));
		//Collections.sort(al);
		 /*Iterator i=al.iterator();
		 String s= null;
		 while(i.hasNext()){
		 s=(String)i.next();
			System.out.println(s);
			}
		*/	
		
		 List l=new ArrayList();
		 
	}

}
