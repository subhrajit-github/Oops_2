package com.SuperKey;
class D extends Object{
	D(){
		System.out.println("no arg ctt in c");
	}
}
class E extends C{
	E(){
		System.out.println("no arg ctt in c");
	}
}
public class Test2 {
    public static void main(String [] args) {
    	new E();
    }
}


