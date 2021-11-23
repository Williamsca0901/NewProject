package com.company.class19.task2;

public class Task2 {
    //write program to inherit class A that has method printF which is static and call or reuse that method into classB
    public static void main (String[]args){
        B.printF();
    }
}
class A{
    static void printF(){
        System.out.println("printF form A");
    }
}
class B extends A{

}