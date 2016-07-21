package com.zensar.corejava;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
public static void main(String[] args) {
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		//Employee e=null;
	    //Dog d=null;
		//WageEmployee w=null;
		Account a=null;
		
				try {
					fis=new FileInputStream("abc.ser");
					ois=new ObjectInputStream(fis);
					//e=(Employee)ois.readObject();
					//d=(Dog)ois.readObject();
					//w=(WageEmployee)ois.readObject();
			        a=(Account)ois.readObject();
			        } catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        catch(Exception e1){
		        	e1.printStackTrace();
		        }
				finally{
					if(fis !=null)
						try {
							fis.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
				}
				//System.out.println(d.cat.rat.j);
	    /*System.out.println(w.getEmployeeId());
		System.out.println(w.getEmployeeName());
		System.out.println(w.getEmployeeSalary());
		System.out.println(w.getRate());
		System.out.println(w.getHours());*/
		
		System.out.println(a.getAccountNo());
		System.out.println(a.getAccountHolderName());
		System.out.println(a.getAccountBalance());
}
}

