package com.company.class19;

public class Task1 {
    //write a program for multilevel inheritance where class A inherited by and class B inherit class by C

    public static void main(String[] args) {
        C b = new C();
    }
}

class A {
    public A() {
        System.out.println("A");
    }
}

class B extends A {
    public B() {
        System.out.println("B");
    }
}

class C extends B {
    public C() {
        System.out.println("C");
    }
}