package com.Innerclass;

interface Theater{
	void popcorn();
}

public class Demo {

	public static void main(String[] args) {
		Theater t1=new Theater() {
		public void popcorn() {
			System.out.println("Salted popcorn");
		}
		};
		t1.popcorn();
		System.out.println(t1.getClass().getName());
	}

}
