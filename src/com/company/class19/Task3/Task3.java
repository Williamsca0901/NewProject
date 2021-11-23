package com.company.class19.Task3;

public class Task3 {
    //Write a Java program called Teacher. Identify features and behavior of that Class. Create 3 subclasses
    //MathTeacher, ChemistryTeacher and PianoTeacher that wourl have their own features and behaviour.
    // Test all 4 classes
    public static void main(String[]args){
        MathTeacher mathTeacher=new MathTeacher();
        mathTeacher.name="Demir";
        mathTeacher.teachMath();

        ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
        chemistryTeacher.name="Demir";
        chemistryTeacher.teachChemistry();
    }
}
class Teacher{
    String name;
    void teach(){
        System.out.println("Teachers teach subjects");
    }
}
class MathTeacher extends Teacher{
    void teachMath(){
        System.out.println(name+"Teaches math");
    }
}
class ChemistryTeacher extends Teacher{
    void teachChemistry(){
        System.out.println(name+"Teaches Chemistry");
    }
}
class PianoTeacher extends Teacher {
    void teachPiano(){
        System.out.println(name+"Teaches piano lessons");
    }
}