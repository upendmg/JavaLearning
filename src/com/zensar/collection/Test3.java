package com.zensar.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test3 {
	public static void main(String[] args) {
		ArrayList s=new ArrayList();
		Employee s1=new Employee(12,"upen",560);
		Employee s2=new Employee(13,"ayush",980);
		Employee s3=new Employee(14,"tushar",590);
		Employee s4=new Employee(17,"ketan",290);
		Employee s5=new Employee(73,"shrey",770);
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		Collections.sort(s,new Comparator<Employee>() {

			@Override
			public int compare(Employee s1, Employee s2) {
				int count=0;
				if(s1.getEmployeeSalary()>s2.getEmployeeSalary())
					count=1;
				if(s1.getEmployeeSalary()<s2.getEmployeeSalary())
					count=-1;
				if(s1.getEmployeeSalary()==s2.getEmployeeSalary())
				    count=0;
				
				return count;
			}
		});
		for(Object e:s)
			System.out.println(e);
			
		
		
	}

}
