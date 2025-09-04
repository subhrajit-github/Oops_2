package com.Obj;

public class Student {
String name;
int age;
String city;
String country;
public Student(String name,int age,String city,String country) {
	this.name=name;
	this.age=age;
	this.city=city;
	this.country=country;
}
public String toString() {
	return name+" "+age+" "+city+" "+country;
			}
public boolean equals(Object o) {
	Student s=(Student)o;
	return this.name.equals(s.name) && this.age==s.age && this.city.equals(s.city) && this.country.equals(s.country);
	
}
}
