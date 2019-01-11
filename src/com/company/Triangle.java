package com.company;

public class Triangle implements FigureInt {
    private int cathetus1;
    private int cathetus2;
    private double hypotenuse;

    @Override
    public double getPerimeter() {

        return 2 * (cathetus1 + cathetus2);
    }

    @Override
    public double getArea() {
        return (cathetus1 * cathetus2) / 2;
    }

    public Triangle(int cathetus1, int cathetus2) {
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
        hypotenuse = Math.sqrt(Math.pow(cathetus1, 2) + Math.pow(cathetus2, 2));
    }
}
