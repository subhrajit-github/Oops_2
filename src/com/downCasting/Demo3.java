package com.downCasting;
  class Car{
	  
  }
  class Bmw extends Car{
	  
  }
  class Benz extends Car{
	  
  }
public class Demo3 {

	public static void main(String[] args) {
		Object o=new Bmw();
		Bmw b=(Bmw)o;//No compile time error & no problem at runtime
		Car c=(Car)o;//No compile time error & no problem at runtime
		Benz b1=(Benz)o;//No compile time error but it will throw ClassCastException at run time
		
	}

}
