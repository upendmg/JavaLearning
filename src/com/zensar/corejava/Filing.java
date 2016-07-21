package com.zensar.corejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filing {
	public static void main(String args[]){ //throws IOException
		File f = new File("zensar.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(f.exists());
        FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream("zensar.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fos=new FileOutputStream("javazensar.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int ch=0;
		try {
			while((ch=fis.read())!=-1){
			     fos.write(ch);
				// System.out.print((char)ch);
 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
     	finally{
     	if (fis !=null)
     	try{
		fis.close();
     	}catch(IOException e){
     		e.printStackTrace();
     	}
     	
         	if (fos !=null)
         	try{
    		fos.close();
         	}catch(IOException e){
         		e.printStackTrace();
         	}
         	
     		}
     	}
}
