package com.Has_a;

public class Car {
     String name;
     int carnum;
     String color;
     Engine e;
     public Car(String name,int carnum,String color,Engine e) {
    	 this.name=name;
    	 this.carnum=carnum;
    	 this.color=color;
    	 this.e=e;
     }
      
      public void display() {
    	  System.out.println(name+"\n"+carnum+"\n"+color+"\n"+e.cc);
      }
}
