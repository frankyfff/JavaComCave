/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe_01_amiri.aufgabe_1a;

/**
 *
 * @author Moe
 */
public class Person {

    private String name = null;
    private int age = 0;
    private static int count = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public void infoPerson() {
        System.out.println("Name: " + name + " Alter: "
                + age + " AbzahlObjekte: " + count);

    }

}
