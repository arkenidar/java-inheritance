package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Mother superObject = new Mother();
        Child subordinateObject = new Child();

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

        Mother.staticSuper();
        Mother.staticVariable++;
    }
}