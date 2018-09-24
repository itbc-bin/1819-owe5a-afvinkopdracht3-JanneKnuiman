package com.company;

public class Afvink3 {

    public static void main(String[] args){
        Student student1 = new Student("Janne", 594106);
        Student student2 = new Student("Valerie", 425513);
        Student student3 = new Student("Sanne", 247514);
        Student student4 = new Student("Rick", 517921);
        Student student5 = new Student(265157);

        student1.info();
        student2.info();
        student3.info();
        student4.info();
        student5.info();

    }
}