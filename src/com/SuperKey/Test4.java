package com.SuperKey;
class Person{
	String name;
	Person(String n){
		name=n;
	}
}
class Teacher extends Person{
	String sub;
	Teacher(String n,String s){
		super(n);
		sub=s;
	}
}
public class Test4 {
   public static void main(String [] args) {
	Teacher t= new Teacher("Ramana","java");
	System.out.println(t.name);
	System.out.println(t.sub);
   }
}
