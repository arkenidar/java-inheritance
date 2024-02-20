package com.example;

public class Mother {
    
    public int i;
    protected int j;

    public static int staticVariable = 100;

    public void showIJ() {
        System.out.println("i: " + i + "; j: " + j + ";");
    }

    public void setIJ(int i, int j){
        this.i = i;
        this.j = j;
    }

    public static void staticSuper() {
        System.out.println("staticSuper");
    }

}
