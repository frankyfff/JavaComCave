/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausur.fragen.b051_b100;

/**
 *
 * @author mamiri
 */
public class Q77 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        Director director = new Director();
        
        employee.salary = 50_000;
        director.salary = 80_000;
        employee.budget = 200_000;
        manager.budget = 1_000_000;
        manager.stockOptions = 500;
        director.stockOptions = 1_000;
        
    }
}


class Employee {
    public int salary;
}

class Manager extends Employee {
    public int budget;
}

class Director extends Manager {
    public int stockOptions;
}