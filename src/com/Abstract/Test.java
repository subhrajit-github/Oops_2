package com.Abstract;
  abstract class AA{
	  AA(){
		  System.out.println("AA()-cons");
	  }
  }
  abstract class BB extends AA{
	  BB(){
		  System.out.println("BB()-cons");
	  }
  }
  class CC extends BB{
	  CC(){
		  System.out.println("CC()-cons");
	  }
  }
public class Test {

	public static void main(String[] args) {
		new CC();

	}

}
