package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz odpowiednio:\n Długość promienia koła:");
        int radiusOfACircle = scanner.nextInt();
        FigureInt circle = new Circle(radiusOfACircle);

        System.out.println("Wpisz pierwszą przyprostokatną trójkąta prostokątnego:");
        int cathetus1 = scanner.nextInt();
        System.out.println("Wpisz drugą przyprostokatną trójkąta prostokątnego:");
        int cathetus2 = scanner.nextInt();
        FigureInt triangle = new Triangle(cathetus1, cathetus2);


        System.out.println("Wpisz pierwszą wartość boku prostokąta:");
        int side1 = scanner.nextInt();
        System.out.println("Wpisz drugą wartość boku prostokąta:");
        int side2 = scanner.nextInt();
        FigureInt rectangle = new Rectangle(side1, side2);


        FigureInt[] figure = new FigureInt[3];
        figure[0] = circle;
        figure[1] = triangle;
        figure[2] = rectangle;


        for (FigureInt element : figure) {
            System.out.println("Obwód figury wynosi:\n"+element.getPerimeter());
            System.out.println("Pole figury wynosi:\n"+element.getArea());
        }


    }
}
