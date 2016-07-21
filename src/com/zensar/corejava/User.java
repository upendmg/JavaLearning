package com.zensar.corejava;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class User {
	public static void main (String args[]) throws IOException{
		File f = new File("zensar.txt");
		f.createNewFile();
		System.out.println(f.exists());
		FileOutputStream fos=new FileOutputStream("zensar.txt");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data in the file");
		String s=sc.next();
		byte[] tc=s.getBytes();
		fos.write(tc);
		fos.close();
	}

}
