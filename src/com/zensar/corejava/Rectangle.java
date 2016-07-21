package com.zensar.corejava;

public class Rectangle implements Shapeable , Printable {
     double length;
     double breadth;
    
    public double Area(){
		return length*breadth;
    }
    public String print(){
    	return "printing area";
    }
    
    public void getArea(){
        System.out.println("Area="+length*breadth);
 }

    Rectangle(double l,double b){
            length=l;
			breadth=b;	
    }
	
	Rectangle(){
		length=4;
		breadth=8;
	}
	public void setArea(double l,double b){
            length=l;
			breadth=b;	
    }
	
    
	
	public String toString(){
		return "area is---->>>"+(length*breadth);
	}
}

