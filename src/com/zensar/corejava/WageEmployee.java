package com.zensar.corejava;

import com.zensar.collection.Employee;

public class WageEmployee extends Employee {

	private int hours;
	private int rate;

	/*public WageEmployee(int employeeId, String employeeName,
			double employeeSalary, int hours, int rate) {
		setEmployeeId(employeeId);
		setEmployeeName(employeeName);
		setEmployeeSalary(employeeSalary);
		this.hours = hours;
		this.rate = rate;
	}*/
	


	public WageEmployee(int employeeId, String employeeName,
			double employeeSalary, int hours, int rate) {
		super(employeeId, employeeName, employeeSalary);
		this.hours = hours;
		this.rate = rate;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int calculateSalary() {
		return super.calculateSalary()+ hours * rate;
	}

	@Override
	public String toString() {
		return super.toString() +"WageEmployee [hours=" + hours + ", rate=" + rate + "]";
	}
	

}
