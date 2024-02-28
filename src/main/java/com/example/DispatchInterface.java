package com.example;

// interface keyword and method dispatch

interface ICallable {
    void callme();
}

class AI implements ICallable {
    public void callme() {
        System.out.println("class AI");
    }
}

class BI implements ICallable {
    public void callme() {
        System.out.println("class BI");
    }
}

class CI implements ICallable {
    public void callme() {
        System.out.println("class CI");
    }
}

public class DispatchInterface {
    public static void main(String[] args) {

        System.out.println("==== DispatchInterface");

        AI a = new AI();
        BI b = new BI();
        CI c = new CI();

        ICallable r;
        r = a;
        r.callme();
        r = b;
        r.callme();
        r = c;
        r.callme();
    }
}
