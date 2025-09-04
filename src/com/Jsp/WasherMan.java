package com.Jsp;
interface washable{
	//marker interface
}
class car implements washable {
	
}
class laptop{}
class bike implements washable{}
class mobile{}
public class WasherMan {
public static void wash(Object o) {
	if(o instanceof washable)
		System.out.println(o.getClass().getSimpleName()+" is washed");
	else 
		System.out.println(o.getClass().getSimpleName()+" is not washed");
}
	public static void main(String[] args) {
		wash(new bike());
		wash(new laptop());

	}

}
