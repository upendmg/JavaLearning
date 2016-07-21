package com.zensar.corejava;

public class checker {
	 
	public static void main(String args[]){
	          
	         //int b;
	           Account a=new Account(121,"upen",4321);
	          
	         /*a.setAccountNo(234);
	           b=a.showAccountNo();
	           System.out.println(b);
	           a.showData();
	           a.deposit();*/
	           a.setData(123,"upen",20000);
	           try {
				a.withdraw();
	           }catch(InsufficientBalanceException e){
	        	   
	        	   System.out.println("Balance should not be less than 1000");
	           }
	}
	}
