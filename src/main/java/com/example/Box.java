package com.example;

public class Box {
    protected double x, y, z;

    Box(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Box(Box box) {
        this.x = box.x;
        this.y = box.y;
        this.z = box.z;
    }

    double calculateVolume() {
        return this.x * this.y * this.z;
    }
}
