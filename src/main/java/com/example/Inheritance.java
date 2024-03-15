package com.example;

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Mother superObject = new Mother();
        MotherChild subordinateObject = new MotherChild();

        superObject.i = 10;
        superObject.j = 20;
        superObject.showIJ();

        subordinateObject.i = 7;
        // subordinateObject.j = 8;
        subordinateObject.k = 9;
        subordinateObject.setIJ(7, 8);

        subordinateObject.showIJ();
        subordinateObject.showK();

        subordinateObject.sumIJK();

        BoxWeight box = new BoxWeight(10, 10, 10, 60);
        System.out.println(box.calculateVolume());
        System.out.println(box.getWeigth());

        // Mother.staticSuper();
        // Mother.staticVariable++;

        Box b1 = new Box(1, 5, 6);
        Box b2 = new Box(1, 3, 6);
        Box b3 = new Box(1, 5, 6);
        System.out.println(b1.equals(b2));
        System.out.println(b3.equals(b1));
    }
}