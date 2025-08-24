package com.Abstraction_1;
  abstract class shape{
	  String color;
	 public shape(String color) {
		 this.color=color;
	 }
	  abstract public void getArea();
	  abstract public void display();
  }
  class rectangle extends shape{
	  int length;
	  int breadth;
	  public rectangle (String color,int length,int breadth){
		  super(color);
		  this.length=length;
		  this.breadth=breadth;
	  }
	  public void getArea(){
		  System.out.println(length*breadth);
	  }
	  public void display(){
		  System.out.println("color:"+color);
		  System.out.println("length:"+length);
		  System.out.println("breadth:"+breadth);
	  }
  } 
  class circle extends shape{
	  int radius;
	  circle(String color,int radius){
		  super(color);
		  this.radius=radius;
	  }
	  public void getArea() {
		  double res=3.14*radius*radius;
		  System.out.println(res);
	  }
	  public void display() {
		  System.out.println("color:"+color);
		  System.out.println("radius:"+radius);
	  }
  }
public class ShapeDriver {

	public static void main(String[] args) {
		shape s;
		s=new rectangle("red",10,20);
		s.getArea();
		s.display();
		System.out.println("============");
		s=new circle("white",10);
		s.getArea();
		s.display();
	}

}
