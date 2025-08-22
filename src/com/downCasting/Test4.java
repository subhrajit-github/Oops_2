package com.downCasting;
import java.util.Scanner;
  class Vehicle
  {
	  public void start()
	  {
		  
	  }
	  public void accelerate()
	  {
		  
	  }
	  public void stop()
	  {
		  
	  }
  }
   class Bmw extends Vehicle
   {
	   public void start()
	   {
			System.out.println("Bmw starts...");  
		  }
	   public void accelerate()
	   {
			System.out.println("Bmw going...");  
		  }
	   public void stop()
	   {
			System.out.println("Bmw stops..."); 
		  }
	   public void autopilot() 
	   {
			System.out.println("Bmw autopilots...");
		  }
  }
   class Audi extends Vehicle
   {
	   public void start()
	   {
			System.out.println("Audi starts...");  
		  }
	   public void accelerate() 
	   {
			System.out.println("Audi going...");  
		  }
	   public void stop() 
	   {
			System.out.println("Audi stops..."); 
		  }
       public void abs()
       {
    	   System.out.println("Audi abs...");
       }
   }
   class Benz extends Vehicle
   {
	   public void start()
	   {
			System.out.println("Benz starts...");  
		  }
	   public void accelerate()
	   {
			System.out.println("Benz going...");  
		  }
	   public void stop()
	   {
			System.out.println("Benz stops..."); 
		  }
	   public void gps() 
	   {
		   System.out.println("Benz gps...");
	   }
   }
public class Test4
{
      public static void drive(Vehicle v)
      {
    	  v.start();
    	  v.accelerate();
    	  v.stop();
    	  if(v instanceof Bmw)
    		  ((Bmw)v).autopilot();
    	  else if(v instanceof Audi)
    		  ((Audi)v).abs();
    	  else if(v instanceof Benz)
    		  ((Benz)v).gps();	  
      }
      public static Vehicle getCar() 
      {
    	  Scanner s=new Scanner(System.in);
    	  System.out.println("1.BMW\n2.AUDI\n3.BENZ\n4.NONE");
    	  int n=s.nextInt();
    	  if(n==1)
    		  return new Bmw();
    	  else if(n==2)
    		  return new Audi();
    	  else if(n==3)
    		  return new Benz();
    	  else
    	  {
    		  System.out.println("Invalid Input");
    		  return null;
    	  }
      }
      public static void main(String [] args) 
      {
    	  drive(getCar());
      }
}
