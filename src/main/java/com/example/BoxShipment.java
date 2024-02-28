package com.example;

public class BoxShipment extends BoxWeight {
    public double cost;

    public BoxShipment(double x, double y, double z, double weight, double cost) {
        super(x, y, z, weight);
        this.cost = cost;
    }

    public BoxShipment(Box box, double weight, double cost) {
        this(box.x, box.y, box.z, weight, cost);
    }

}
