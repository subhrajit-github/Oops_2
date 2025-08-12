package com.Is_A;
class CC{
	int i=10;
	int j=20;
}
class DD extends CC{
	int k=30;
	public void display() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
public class Demo_2 {
    public static void main(String [] args) {
    	DD d=new DD();
    	d.display();
    }
}
