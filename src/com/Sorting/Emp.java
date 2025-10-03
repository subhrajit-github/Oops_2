package com.Sorting;

public class Emp implements Comparable<Emp> {
    String name;
    int id;
    double sal;
    static int x = 100;

    public Emp(String n, double s) {
        name = n;
        sal = s;
        id = x++;
    }

    // Correct method signature
    @Override
    public int compareTo(Emp other) {
        return this.name.compareTo(other.name); // sort by name
    }

    @Override
    public String toString() {
        return "Emp[name=" + name + ", id=" + id + ", sal=" + sal + "]";
    }
}
