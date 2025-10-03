package com.Sorting;

import java.util.Arrays;

public class Circle implements Comparable<Circle> {
    int radius;

    public Circle(int r) {
        radius = r;
    }

    @Override
    public int compareTo(Circle other) {
        return this.radius - other.radius; // ascending order
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

    public static void main(String[] args) {
        Circle[] a = {
            new Circle(30),
            new Circle(50),
            new Circle(10),
            new Circle(40),
            new Circle(20),
        };

        Arrays.sort(a);

        for (Circle c : a) {
            System.out.println(c);
        }
    }
}
