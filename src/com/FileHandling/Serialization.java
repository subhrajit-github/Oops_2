package com.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

    public static void main(String[] args) throws IOException {
        Student s = new Student("Tara", 18, 1);
        FileOutputStream f = new FileOutputStream("C:\\Users\\HP\\OneDrive\\FileHandling\\c.txt");
        try (ObjectOutputStream o = new ObjectOutputStream(f)) {
            o.writeObject(s);
        }
        System.out.println("Serialization done");
    }
}

