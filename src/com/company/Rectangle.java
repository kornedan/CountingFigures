package com.company;

public class Rectangle implements FigureInt{
    private int side1;
    private int side2;

    @Override
    public double getPerimeter() {
        return 2 * (side1 + side2);
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
}