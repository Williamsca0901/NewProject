package com.company.class21;


public class Student {
    /*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism*/


    void willGraduate() {
        System.out.println("Most students will graduate");
    }

    void studiesHard() {
        System.out.println("Most students study hard");
    }
    void onlineClass() {
        System.out.println("Have classes online");

    }
}
class SyntaxStudent extends Student {
    @Override
    void studiesHard() {
        System.out.println("We have many teachers");
    }
}
    class CollegeStudent extends Student {
        @Override
        void willGraduate() {
            System.out.println("Most students will change major");
        }
        }

        class SchoolStudent extends Student {
            @Override
            void onlineClass() {
                System.out.println("Now attends classes in person");
            }
            }









