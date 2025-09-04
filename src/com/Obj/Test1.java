package com.Obj;
class pen{
	String name;
	double price;
	String color;
	public pen(String name,double price,String color) {
		this.name=name;
		this.price=price;
		this.color=color;
	}
	public String toString() {
		return name+"\n"+price+"\n"+color;
	} 
}
public class Test1 {

	public static void main(String[] args) {
		pen p1=new pen("cello",10,"blue");
		System.out.println(p1);

	}

}
