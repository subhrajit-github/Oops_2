package com.Java_8.StreamApi;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

public class OccurenceChar {

    public static void main(String[] args) {
        String s = "apple mango apple banana mango apple";

        // Count each character (including spaces)
        Map<Character, Long> m = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        m.forEach((ch, count) -> System.out.println(ch + " = " + count));
    }
}
