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

    Box(double same) {
        this(same, same, same);
    }

    double calculateVolume() {
        return this.x * this.y * this.z;
    }

    boolean equals(Box box) {
        return x == box.x && y == box.y && z == box.z;
    }
}
