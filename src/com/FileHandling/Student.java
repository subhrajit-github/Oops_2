package com.FileHandling;

import java.io.Serializable;

public class Student  implements Serializable{
	String name;
	int age;
	int id;
	public Student(String name, int age, int id) {
		this.name=name;
		this.age=age;
		this.id=id;
	}
	public String toString() {
		return "Student [name = "+ name +" , age = "+" , id = "+id+" ] ";
	}
}
