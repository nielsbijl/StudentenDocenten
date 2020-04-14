package com.company;

public class Student {
    String name;
    int age;
    int grade;
    boolean pet;

//    Contructor
    public Student(String Name, int Age, int Grade, boolean Pet) {
        name = Name;
        age = Age;
        grade = Grade;
        pet = Pet;
    }
    public int getGrade(){
        return grade;
    }
}
