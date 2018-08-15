package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private double sideLength;
    private double height;

    public Triangle(double sideLength, double height) {
        this.sideLength = sideLength;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return sideLength*height/2;
    }
}
