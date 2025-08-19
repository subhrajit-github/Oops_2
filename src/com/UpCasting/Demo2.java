package com.UpCasting;
class X{
	int i=10;
}
class Y extends X{
	int i=20;
}
class Z extends X{
	int i=30;
}
public class Demo2 {
    public static void main(String [] args) {
    	X x1=new Y();
    	System.out.println(x1.i);
    	X x2=new Z();
    	System.out.println(x2.i);
    	}
}
