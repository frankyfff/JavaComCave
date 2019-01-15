/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.question_130_140;

/**
 *
 * @author Moe
 */
public class Q136 {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[1] = new Student("Richard");
        students[2] = new Student("Donald");
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}

class Student {

    String name;

    public Student(String name) {
        this.name = name;
    }
}


/**
 *  NullpionterException 
 *  Aufgrund von students[0] nicht vorhanden!
 * 
 * 
 */