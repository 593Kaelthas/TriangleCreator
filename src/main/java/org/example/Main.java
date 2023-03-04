package org.example;

import Exceptions.UncreatedTriangle;

public class Main {
    public static void main(String[] args) throws UncreatedTriangle {
        Triangle triangle = new Triangle(3.0,4.0,5.0);
        System.out.println(triangle.toString());

    }
}