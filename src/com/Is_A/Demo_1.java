package com.Is_A;
class AA{
	int i=10;
	static int j=20;
}
class BB extends AA{
	
}
public class Demo_1 {
     public static void main(String [] args) {
    	 BB b=new BB();
    	 System.out.println(b.i);
    	 System.out.println(b.j);
     }
}
