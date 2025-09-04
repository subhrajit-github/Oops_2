package com.SingleTonClass;

public class TheaterTest {

	public static void main(String[] args) {
		//theater t=new theater();/compile time error
		theater user1=theater.get();
		theater user2=theater.get();
		theater user3=theater.get();
		user1.bookTicket(60);
		user2.bookTicket(40);
		user3.bookTicket(20);

	}

}
