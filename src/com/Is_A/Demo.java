package com.Is_A;
class Animal{
	void eat(){
		System.out.println("Animal Eat");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Bow Bow");
	}
}
class BabyDog extends Dog{
	void weep() {
		System.out.println("Weeping...");
	}
}
public class Demo {
      public static void main(String [] args) {
    	  Animal a=new Animal();
    	  a.eat();
    	  //a.bark();//Compile time Error
    	  Dog d=new Dog();
    	  d.eat();
    	  d.bark();
    	  //d.weep();//Compile time Error
    	  BabyDog b=new BabyDog();
    	  b.eat();
    	  b.bark();
    	  b.weep();
      }
}
