package com.Obj;

public class GameOfThrone {

	public static void main(String[] args) {
		Got g1=new Got("Tyrion",16,"Kingsland");
		Got g2=new Got("Sansa",18,"Wall");
		System.out.println(g1==g2);
		System.out.println(g1.equals(g2));
		System.out.println(g2.equals(g1));

	}

}
