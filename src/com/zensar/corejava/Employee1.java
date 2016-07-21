package com.zensar.corejava;
import java.io.Serializable;

public class Employee1 implements Serializable {
	private int employeeId;
	private String employeeName;
    private static transient double employeeSalary=200;
    
    public Employee1(int employeeId, String employeeName, double employeeSalary) {
	
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		//this.employeeSalary = employeeSalary;
	}

       Employee1(){
                 employeeId=12345;
	     employeeName="upendra";
	     employeeSalary=70000;
            }
         
            public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	/*public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}*/
			public String toString(){
		return employeeId+"/"+employeeName+"/"+employeeSalary;
	}





}
