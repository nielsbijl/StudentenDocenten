package com.company;

public class Class {
    String name;
    Student[] students;
    String[] teachers;

    public Class(String Name, Student[] Students, String[] Teachers){
        name = Name;
        students = Students;
        teachers = Teachers;
    }
    public double averageGrade(){
        double grades = 0;
        for (Student i : students) {
            grades += i.getGrade();
        }
        return grades / students.length;
    }
}
