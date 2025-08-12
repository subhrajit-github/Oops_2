package com.Is_A;
class Card{
	String name;
	long cardnum;
	String exp;
	public void swipe() {
		System.out.println("Card Swiping...");
	}
}
class CreditCard extends Card{
	int cvv;
	long limit;
	public void pay() {
		System.out.println("Pay by using credit card");
	}
	public void details() {
	   System.out.println("card name :"+name);
	   System.out.println("card number :"+cardnum);	
	   System.out.println("card exp :"+exp);	
	   System.out.println("card cvv :"+cvv);	
	   System.out.println("card limit :"+limit);	
	}
}
class DebitCard extends Card{
	int bal;
}
public class CardDriver {
     public static void main(String [] args) {
    	 CreditCard c=new CreditCard();
    	 c.name="visa";
    	 c.cardnum=1289763615;
    	 c.exp="12/32";
    	 c.cvv=1000;
    	 c.limit=50000;
    	 c.swipe();
    	 c.pay();
    	 c.details();
     }
}
