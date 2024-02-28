package com.example;

// common ancestor and abstract keyword

abstract class Figure {
    abstract double area();
}

class Triangle extends Figure {
    double area() {
        return 11;
    }
}

class Rectangle extends Figure {
    double area() {
        return 22;
    }
}

/**
 * FindArea
 */
public class FindArea {

    public static void main(String[] args) {

        System.out.println("abstract class");

        // Figure f = new Figure();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();

        Figure figref;
        figref = r;
        System.out.println(figref.area());
        figref = t;
        System.out.println(figref.area());
    }
}
