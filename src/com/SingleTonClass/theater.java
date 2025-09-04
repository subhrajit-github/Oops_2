package com.SingleTonClass;

public class theater {
 int seats=100;
 public static theater t;
 private theater() {}
	 public void bookTicket(int n) {
		 if(n>seats) {
			 System.out.println(n+" seats are not available :)");
			 return;
		 }
		 seats-=n;
		 System.out.println(n+ "seats are booked");
		 System.out.println(seats+" Seats are available");
	 }
	 public static theater get() {
		 if(t==null) {
			 t=new theater();
			 return t;
		 }
		 return t;
	 }
 }

