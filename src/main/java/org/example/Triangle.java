package org.example;

import Exceptions.UncreatedTriangle;




public class Triangle {
    //class enum
    public enum TriangleType{
        EQUILATERO, ISOCELES,ESCALENO;
    }
    //attributes
    private double side1;
    private double side2;
    private double side3;
    private TriangleType triangleType;


    //constructor
    public Triangle(double side1, double side2, double side3) throws UncreatedTriangle {
        if(!hasValidSides(side1,side2,side3)) {
            throw new UncreatedTriangle("The values provided don't match with triangle inequality!");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.setTriangleType();
    }
    //getters & setters


    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public TriangleType getTriangleType() {
        return triangleType;
    }

    public void setTriangleType() {
        if (side1==side2 && side2==side3){
            this.triangleType = TriangleType.EQUILATERO;
        }
        else if (side1 == side2 || side1 ==side3 || side2==side3) {
            this.triangleType = TriangleType.ISOCELES;
        } else {
            this.triangleType = TriangleType.ESCALENO;
        }
    }

    //class methods
    public boolean hasValidSides(double side1, double side2, double side3){
        return (side1+side2>side3 && side2+side3>side1 && side3+side1>side2);
    }
    //overrided methods


    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", triangleType=" + triangleType +
                '}';
    }
}
