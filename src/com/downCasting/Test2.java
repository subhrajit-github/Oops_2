package com.downCasting;
//   class Animal{
//	   public void eat() {
//		   System.out.println("Animal eat");
//	   }
//   }
//   class Dog extends Animal{
//	   public void eat() {
//		   System.out.println("Dog eat");
//	   }
//	   public void bark() {
//		   System.out.println("Dog bark");
//	   }
//   }
//public class Test2 {
//  public static void main(String [] args) {
//	  Animal a=new Animal();
//	  //Dog d=(Dog)a;//ClassCastException
//	  Dog d=new Dog();
//	  a=(Dog)d;//upCasting
//	  a.eat();//Dog Eat
//	 // a.bark();//CompileTimeError
//	  d=(Dog)a;//DownCasting
//	  d.eat();//Dog Eat
//	  d.bark();//Dog Bark
//  }
//}
