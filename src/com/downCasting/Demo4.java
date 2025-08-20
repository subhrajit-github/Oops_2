package com.downCasting;
  class Vehicle{
	  
  }
  class Honda extends Vehicle{
	  
  }
  class Audi extends Vehicle{
	  
  }
public class Demo4 {

	public static void main(String[] args) {
		Vehicle v=new Honda();
		System.out.println(v instanceof Honda);
		System.out.println(v instanceof Audi);
		System.out.println(v instanceof Vehicle);
		System.out.println(v instanceof Object);

	}

}
