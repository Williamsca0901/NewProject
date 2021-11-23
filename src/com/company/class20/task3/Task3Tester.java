package com.company.class20.task3;

import com.company.class20.task2.Programming;

public class Task3Tester {
    public static void main(String []args){
        task3.method(false);
        task3.method(10L);
        task3.method(10f);
        Programming programming=new Programming();
        task3.method(programming);
    }
}
