package com.SuperKey;
 class F{
	 F(int i){
		 System.out.println("int arg constructor in E");
	 }
 }
 class G extends F{
	 G(){
		 super(10);
		 System.out.println("int arg constructor in F");
	 }
 }
public class Test3 {
       public static void main(String [] args) {
    	   new G();
       }
}
