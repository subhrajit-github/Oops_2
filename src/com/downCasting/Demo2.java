package com.downCasting;
  class Animal{
	  
  }
  class Dog extends Animal{
	  
  }
  class Labrador extends Dog{
	  
  }
public class Demo2 {
   public static void main(String [] args) {
	   Animal a=new Labrador();
	   Labrador l=(Labrador)a;
	   Dog d=(Dog)a;
	   System.out.println("Done");
   }
}
