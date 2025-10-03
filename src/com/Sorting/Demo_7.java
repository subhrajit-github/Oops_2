package com.Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class Demo_7 {
    public static void main(String[] args) {
        String[] a = {"javascript", "python", "android", "c"};

        // Sort alphabetically (default natural order)
        System.out.println("Alphabetical order:");
        Arrays.sort(a);
        for (String s : a) {
            System.out.println(s);
        }

        // Sort by length using Comparator
        System.out.println("\nLength order:");
        Arrays.sort(a, new LenComp());
        for (String s : a) {
            System.out.println(s);
        }
    }
}

// Custom comparator to sort by string length
class LenComp implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
