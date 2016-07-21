package com.zensar.corejava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {
	public static void main (String args[]){
		FileReader fr=null;
		File f=null;
		f=new File("zensar.txt");
		try {
			fr=new FileReader("zensar.txt");
		    } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int ch=0;
		
			try {
				while((ch=fr.read())!=-1){
					System.out.print((char)ch);
}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
		     	if (fr !=null)
		     	try{
				fr.close();
		     	}catch(IOException e){
		     		e.printStackTrace();
		     	}
			}
}
}
