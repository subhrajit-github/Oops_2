package com.Abstraction_1;
  abstract class Bank{
	  abstract int rateofInt();
		  
  }
  class SBI extends Bank{
	  public int rateofInt() {
		  return 10;
	  }
  }
  class ICICI extends Bank{
	  public int rateofInt() {
		  return 11;
	  }
  }
  class AXIS extends Bank{
	  public int rateofInt() {
		  return 9;
	  }
  }
public class Demo2 {

	public static void main(String[] args) {
		Bank b;
		b=new SBI();
		System.out.println("SBI rate of intrest is:"+b.rateofInt());
		b=new ICICI();
		System.out.println("ICICI rate of intrest is:"+b.rateofInt());
		b=new AXIS();
		System.out.println("AXIS rate of intrest is:"+b.rateofInt());

	}

}
