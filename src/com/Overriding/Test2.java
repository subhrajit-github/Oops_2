package com.Overriding;
  class Animal{
	  void move() {
		  System.out.println("running");
	  }
  }
  class Dog extends Animal{
	  
  }
  class Snake extends Animal{
	  void move() {
		  System.out.println("crawling");
	  }
  }
public class Test2 {
    public static void main(String [] args) {
    	Snake s=new Snake();
    	s.move();
    }
}
