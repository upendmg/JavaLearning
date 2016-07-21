package com.zensar.corejava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyExample {
	public static void main(String args[]){
		FileReader fr=null;
		String name=null;
		int age=0;
		
		try {
			fr=new FileReader(".\\src\\resources\\db.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties pr=null;
		pr=new Properties();
		try {
			pr.load(fr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(fr !=null)
			try {
				fr.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	name=pr.getProperty("name");
	age=Integer.parseInt(pr.getProperty("age"));
	System.out.println("your name is "+ name +" your age is "+ age);
	}
	
	

}
