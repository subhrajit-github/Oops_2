package com.Obj;

public class StudentProperty {

	public static void main(String[] args) {
		Student s1=new Student("abc",18,"Bengaluru","India");
		Student s2=new Student("abc",18,"Bengaluru","India");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));

	}

}
