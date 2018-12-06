/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tag_04_12_18;

import Tag_03_12_18.*;
import java.util.Scanner;

/**
 *
 * @author Moe
 */
public class Test03 {

    public static void main(String[] args) {

        start();
        method1();
        end();

    }

    public  static void start() {
        System.out.println("####################################################");
        System.out.println("#                 Test 3                           #");
        System.out.println("####################################################");
    }

    public static void method1() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Zahl bitte eingeben: ");
        int zahl1 = scanner.nextInt();

        System.out.println("2. Zahl bitte eingeben: ");
        int zahl2 = scanner.nextInt();

        System.out.println("1. Zahl: " + zahl1);
        System.out.println("2. Zahl: " + zahl2);

        int sum = zahl1 + zahl2;
        int diff = zahl1 - zahl2;
        int prod = zahl1 * zahl2;

        double div = 1.0 * zahl1 / zahl2;

        int mod = zahl1 % zahl2;

        System.out.println("zahl1 + zahl2 = " + sum);
        System.out.println("zahl1 - zahl2 = " + diff);
        System.out.println("zahl1 + zahl2 = " + prod);
        System.out.println("zahl1 + zahl2 = " + div);
        System.out.println("zahl1 + zahl2 = " + mod);
    }

    public static void end() {
        System.out.println("####################################################");
        System.out.println("#                 Ende                             #");
        System.out.println("####################################################");
    }
}
