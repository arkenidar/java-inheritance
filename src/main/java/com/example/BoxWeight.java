package com.example;

public class BoxWeight extends Box {
    protected double weight;

    BoxWeight(double x, double y, double z, double weight) {
        super(x, y, z);
        this.weight = weight;
    }

    public double getWeigth() {
        return weight;
    }

    BoxWeight(BoxWeight box) {
        super(box);
        this.weight = box.weight;
    }

}
