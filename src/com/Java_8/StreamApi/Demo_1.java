package com.Java_8.StreamApi;

import java.time.Duration;
import java.time.LocalDateTime;

public class Demo_1 {

	public static void main(String[] args) {
		LocalDateTime st=LocalDateTime.of(2004,1,22,12,00);
		LocalDateTime end=LocalDateTime.now();
		Duration d=Duration.between(st, end);
		System.out.println(d.toDays()/365);
		System.out.println(d.toDays());
		System.out.println(d.toHours());
		System.out.println(d.toMinutes());
	}

}
