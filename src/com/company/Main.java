package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Create the students.....");
        Student Niels = new Student("Niels", 18, 8, false);
        Student Erik = new Student("Erik", 20, 7, true);
        Student Sarah = new Student("Sarah", 18, 8, true);
        Student Daan = new Student("Daan", 18, 7, false);
        Student Mathijs = new Student("Mathijs", 18, 7, false);
        Student Stijn = new Student("Stijn", 19, 5, true);

        System.out.println("Create the classes.....");
        Student[] students = {Niels, Erik, Sarah, Daan, Mathijs, Stijn};
        String[] Teachers = {"David", "Rick"};
        Class V1A = new Class("V1A", students, Teachers);
        for (Student i : V1A.students) {
            System.out.println(i.name);
        }
        System.out.println("The average grade of the class is: " + V1A.averageGrade());
    }
}
