package com.company;

public class Circle implements FigureInt {
    private int radiusOfACircle;

    @Override
    public double getPerimeter() {

        return (double) 2 * Math.PI * radiusOfACircle;
    }

    @Override
    public double getArea() {

        return Math.PI * (Math.pow(radiusOfACircle, 2));
    }

    public Circle(int radiusOfACircle) {
        this.radiusOfACircle = radiusOfACircle;
    }

}
