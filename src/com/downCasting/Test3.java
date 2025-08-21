package com.downCasting;
   class Animal{
	   public void eat() {
		   System.out.println("Animal eat");
	   }
   }
   class Dog extends Animal{
	   public void eat() {
		   System.out.println("Dog eat");
	   }
	   public void bark() {
		   System.out.println("Dog bark");
	   }
   }
   class Babydog extends Dog{
	   public void eat() {
		   System.out.println("Babydog eat");
	   }
	   public void bark() {
		   System.out.println("Babydog bark");
	   }
	   public void weep() {
		   System.out.println("Weeping....");
	   }
   }
public class Test3 {

	public static void main(String[] args) {
		Animal a=new Babydog();//upcasting Babydog to animal
		a.eat();//Babydog eat
		//a.bark();//Compile time error
		Dog d=(Dog)a;//DownCasting Animal(Babydog) to Dog
		d.eat();//Babydog eat
		d.bark();//Babydog bark
		//d.weep();//Compile time error
		Babydog b=(Babydog)a;//DownCasting Animal to Babydog
		b.eat();//Babydog eat
		b.bark();//Babydog bark
		b.weep();//Babydog weep

	}

}
