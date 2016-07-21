package com.zensar.corejava;

import java.io.Serializable;

public class SalesPerson extends WageEmployee{
	private int commision;

	

	public SalesPerson(int employeeId, String employeeName, double employeeSalary, int hours, int rate, int commision) {
		super(employeeId, employeeName, employeeSalary, hours, rate);
		this.commision = commision;
	}


	public SalesPerson(int employeeId, String employeeName, double employeeSalary, int hours, int rate) {
		super(employeeId, employeeName, employeeSalary, hours, rate);
	}


	public int getCommision() {
		return commision;
	}

	public void setCommision(int commision) {
		this.commision = commision;
	}

	public int calculateSalary() {
		return (getHours() * getRate()) + commision;
	}

}

