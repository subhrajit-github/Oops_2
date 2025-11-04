package com.Java_8;

public class Emp{
	String Ename;
	char gender;
	public Emp(String Ename, char gender) {
		this.Ename=Ename;
		this.gender=gender;
	}
	public String toString() {
		return "Employee [Ename = "+Ename+" gender + "+gender+" ]";
	}
}

