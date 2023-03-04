package org.example;

import Exceptions.UncreatedTriangle;

public class Main {
    public static void main(String[] args) throws UncreatedTriangle{
        try {
            Triangle triangle0 = new Triangle(1.0,2.0,3.0);

        } catch (UncreatedTriangle uncreatedTriangle){

        } finally {

        }

        Triangle triangle2 = new Triangle(1.0,2.0,3.0);



    }
}