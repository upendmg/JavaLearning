package com.zensar.collection;

import java.util.Comparator;

public class Student implements Comparable,Comparator {
	private int id;
	private String name;
	private int marks;
	
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ",marks=" + marks +"]";
	}
	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		int count=100;
		if(this.id>s.getId())
			count=1;
		if(this.id<s.getId())
			count=-1;
		if(this.id==s.getId())
		    count=0;
		//return (this.name.compareTo(s.getName()));
		return count;
		}
	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		int count=0;
		if(s1.getMarks()>s2.getMarks())
			count=1;
		if(s1.getMarks()<s2.getMarks())
			count=-1;
		if(s1.getMarks()==s2.getMarks())
		    count=0;
		
		return count;
	}
	
	
		

}
