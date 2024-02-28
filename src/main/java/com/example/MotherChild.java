package com.example;

public class MotherChild extends Mother {
    public int k;

    public void sumIJK() {
        System.out.println("sum: " + (i + j + k));
    }

    public void showK() {
        System.out.println("k: " + k);
    }
}
