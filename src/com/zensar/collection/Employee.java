package com.zensar.collection;

import java.util.Comparator;

//import java.io.Serializable;

public class Employee implements Comparator,Comparable {

	private int employeeId;
	private String employeeName;
	private double employeeSalary;

	
	public Employee(int employeeId, String employeeName, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;

	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public  String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", employeeSalary=" + employeeSalary + "]";
	}
	public int calculateSalary(){
		return 0;
	}
	
	
	
	
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(employeeSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (Double.doubleToLongBits(employeeSalary) != Double.doubleToLongBits(other.employeeSalary))
			return false;
		return true;
	}
*/
	@Override
	public int compare(Object o1, Object o2) {
		Employee s1=(Employee)o1;
		Employee s2=(Employee)o2;
		int count=0;
		if(s1.getEmployeeSalary()>s2.getEmployeeSalary())
			count=1;
		if(s1.getEmployeeSalary()<s2.getEmployeeSalary())
			count=-1;
		if(s1.getEmployeeSalary()==s2.getEmployeeSalary())
		    count=0;
		
		return count;
	}

@Override
public int compareTo(Object arg0) {
	// TODO Auto-generated method stub
	return 0;
}
	

}
