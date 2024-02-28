package com.example;

// class hierarchy and method override (method dispatch)

public class Dispatch {
    public static void main(String[] args) {

        System.out.println("==== Dispatch");

        A a = new A();
        B b = new B();
        C c = new C();

        A r;
        r = a;
        r.callme();
        r = b;
        r.callme();
        r = c;
        r.callme();
    }
}

class A {
    void callme() {
        System.out.println("class A");
    }
}

class B extends A {
    void callme() {
        System.out.println("class B");
    }
}

class C extends B {
    void callme() {
        System.out.println("class C");
    }
}