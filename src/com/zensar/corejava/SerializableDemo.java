package com.zensar.corejava;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//import java.io.Serializable;

/*
class Dog implements Serializable{
	Cat cat=new Cat();
}
class Cat implements Serializable{
	Rat rat=new Rat();
}
class Rat implements Serializable{
	int j=20;
}*/

public class SerializableDemo {
	public static void main(String[] args) {
		//Dog d=new Dog();
		//WageEmployee w=new WageEmployee(123,"upen",200,10,100);
		Account a=new Account(142,"upendra",2000);
		//Employee e=new Employee(123,"upen",200);
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("abc.ser");
			oos=new ObjectOutputStream(fos);
			//oos.writeObject(d);
			//oos.writeObject(e);
			//oos.writeObject(w);
			oos.writeObject(a);
			System.out.println("Object written successfully");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

}
