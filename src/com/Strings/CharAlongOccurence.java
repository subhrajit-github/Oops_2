package com.Strings;
import java.util.Scanner;

public class CharAlongOccurence {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String");
      String s=sc.nextLine();
      char [] ch=s.toCharArray();
      for(int i=0;i<ch.length;i++) {
    	  
    	  char count='1';
    	  if(ch[i]>='0' && ch[i]<='9') continue;
    	  for(int j=i+1;j<ch.length;j++) {
    		  if(ch[i]==ch[j]) {
    			  count++;
    			  ch[j]=count;
    			  ch[i]='1';
    		  }
    	  }
    	  
    	  System.out.print(ch[i]);
      }
    }
}

