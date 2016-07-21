package com.zensar.corejava;

public  class Circle   implements Shapeable ,Printable{
    private double radius;
    
    public double Area(){
    	return 3.14*radius*radius;
    }
    public String print(){
    	return "printing area";
    }
    
    
    public void setArea(){
        radius=4;	
}
    Circle(double r){
            radius=r;	
    }
	
Circle(){
	radius=4;
}

	
    public void getArea(){
        System.out.println("Area="+3.14*radius*radius);
    }
	
public String toString(){
	return "area is---->>>"+(3.14*radius*radius);
}




}