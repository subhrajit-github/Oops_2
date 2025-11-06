package com.Java_8.StreamApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo_2 {

	public static void main(String[] args) {
		ZonedDateTime a=ZonedDateTime.now(ZoneId.of("America/New_York"));
		ZonedDateTime b=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(a);
		System.out.println(b);
	}

}
