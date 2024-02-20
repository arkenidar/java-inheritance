package com.example;

public class Child extends Mother {
    public int k;

    public void sumIJK() {
        System.out.println("sum: " + (i + j + k));
    }

    public void showK(){
        System.out.println("k: "+k);
    }
}
