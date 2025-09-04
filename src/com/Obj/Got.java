package com.Obj;

public class Got {
String name;
int age;
String kingdom;
public Got(String name,int age,String kingdom) {
	this.name=name;
	this.age=age;
	this.kingdom=kingdom;
}
public String toString() {
	return name+"\n"+age+"\n"+kingdom;		
}
public boolean equals(Object o) {
	Got g=(Got)o;
	//return this.kingdom==g.kingdom;
	return this.kingdom.equals(g.kingdom) && this.age==g.age && this.name.equals(g.name);
}
}
