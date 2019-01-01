package klausur.fragen.b051_b100;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mamiri
 */
public class Q94 {

    private String name;
    private int age;
    private int salary;

//    public Q94() {
//    }
    public Q94(String name, int age) {
        setName(name);
        setAge(age);
        setSalary(2000);
    }

    public Q94(String name, int age, int salary) {

        this(name, age);
        setSalary(salary);
        

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println(name + " : " + age + " : " + salary);
    }

}

class Test {

    public static void main(String[] args) {

        Q94 q2 = new Q94("Jack", 50);
        Q94 q3 = new Q94("Chole", 40, 5000);

        q2.printDetails();
        q3.printDetails();
    }
}
