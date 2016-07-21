package com.zensar.corejava;

import java.io.Serializable;

public class Account implements Serializable {
	private int accountNo;
    private String accountHolderName;
    private int accountBalance;
  
    public Account(int accountNo, String accountHolderName, int accountBalance) {
		//super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	public void setAccountNo(int d){
            accountNo=d;
   } 
    public int showAccountNo(){
            return accountNo;
     
   }


    public void setData(int e,String s,int d){
            accountNo=e;
            accountHolderName=s;
            accountBalance=d;
   } 
    
   public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getAccountNo() {
		return accountNo;
	}
public void showData(){
           System.out.println(accountNo +"  "+accountHolderName+"  "+accountBalance);
     
   }
   public void deposit(){

          accountBalance=accountBalance + 500;
          System.out.println("new balance after deposit is is"+accountBalance);
   }
   public int withdraw()throws InsufficientBalanceException{
          accountBalance=accountBalance - 700;
          System.out.println("new balance after withdraw isis"+accountBalance);
          if(accountBalance<1000){
        	  throw new InsufficientBalanceException();
        	  //System.out.println("insufficient balance");
        	  
          }
          return accountBalance;
}
}