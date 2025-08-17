package com.SuperKey;
class C extends Object{
	C(){
		System.out.println("no arg ctt in c");
	}
}
class D extends C{
	D(){
		System.out.println("no arg ctt in c");
	}
}
public class Test2 {
    public static void main(String [] args) {
    	new D();
    }
}


