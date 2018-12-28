/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausur.fragen.a001_a050;

/**
 *
 * @author Moe
 */
public class Q27 {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A {

    public A() {
        System.out.println("A ");
    }
}

class B extends A {

    public B() {
        System.out.println("B ");
    }
}

class C extends B{

    public C() {
        System.out.println("C ");
    }
}

/**
 *      What is the resault?
 *      a) C B A
 *      b) C
 *      c) A B C
 *      d) Compilation fails at line 1 and line 2
 * 
 * 
 */