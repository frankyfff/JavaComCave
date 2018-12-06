
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test04_QuickStart {

  // Nicht-lokale Variablen (Top-Level Variablen: mein Begriff)
  static int number = 23;
  static final double PI = 3.1415;  // Konstante (wegen final)

  public static void main(String[] args) {
    System.out.println("#######################################");
    System.out.println("number: " + number);
    System.out.println("#######################################");
    method1();
    method2("Schmidt", 3);
    System.out.println("#######################################");
//    PI = 45.12; // nicht erlaubt, da PI eine Konstante ist
    System.out.println("#######################################");
    ifTestEinzeilig(15);
    ifTestMehrzeilig(3);
    System.out.println("#######################################");
    switchTest();
    System.out.println("#######################################");
    forTest();
    System.out.println("#######################################");
    whileTest();
    System.out.println("#######################################");
    arrayTest();
    System.out.println("#######################################");
    tryCatchTest1();
    System.out.println("################ ENDE #################");
    tryCatchTest2();
    System.out.println("################ ENDE #################");
  }

  public static void method1() {
    // Lokale Variablen
    int zahl = 3;
    String nachname = "Schmidt";
    Person person1 = new Person();
    int counter = zahl * 12 - 4;
  }

  public static void method2(String name, int index) { // Methodendeklaration
    System.out.println("method2() is running ...");
  }

  public static void ifTestEinzeilig(int zahl) {
    if (zahl > 10) {
      System.out.println("Eine grosse Zahl");
    } else if (zahl > 5) {
      System.out.println("Eine mittlere Zahl");
    } else {
      System.out.println("Eine kleine Zahl");
    }
  }

  public static void ifTestMehrzeilig(int zahl) {
    int counter = 0;
    if (zahl > 10) {
      System.out.println("Eine grosse Zahl");
      counter = counter + 1;
    } else if (zahl > 5) {
      System.out.println("Eine mittlere Zahl");
    } else {
      System.out.println("Eine kleine Zahl");
    }
  }

  public static void switchTest() {
    int counter = 12;
    switch (counter) { // byte, short, int, String, enum
      case 0:
        System.out.println("Null");
        break;
      case 1:
        System.out.println("Eins");
        break;
      case 2:
        System.out.println("Zwei");
        break;
      default:
        System.out.println("Eine Zahl anders als 0,1,2");
    }
  }

  public static void forTest() {
    for (int i = 0; i < 20; i++) {
      System.out.println(i + " ===> " + i * 2);
    }
    System.out.println("Some Text");
  }

  public static void whileTest() {
    while (number > 15) {
      System.out.println("number: " + number);
      number--; // number = number - 1
    }
  }

  public static void arrayTest() {
//    int[] zahlen = new int[6]; // alle Elemente werden mit 0 initialisiert
    int[] zahlen = {12, 13, 56, 88, 9, 110};
    Person[] personen = new Person[3]; // alle Elemente werden mit null initialisiert

    System.out.println("zahlen[3]: " + zahlen[3]);
    zahlen[3] = 77;
    System.out.println("zahlen[3]: " + zahlen[3]);
    System.out.println("###############");
    // Standard For Loop
    for (int i = 0; i < zahlen.length; i = i + 2) { // 0..5
      System.out.println(zahlen[i]);
    }
    System.out.println("###############");
    for (int i = zahlen.length - 1; i >= 0; i--) { // 5..0
      System.out.println(zahlen[i]);
    }
    System.out.println("###############");
    // Enhanced For Loop
    for (int z : zahlen) {
      System.out.println(z);
    }
  }

  public static void tryCatchTest1() {
    int zahl = 12;
    int quot = 0;
    // Anweisung1
    try {
      System.out.println(zahl / quot);
      System.out.println("Die Berechnung wurde duchgeführt!");
    } catch (ArithmeticException ex) {
      System.out.println("Fehler bei der Berechnung");
      ex.printStackTrace();
    }
    // Anweisung3
  }

  private static void tryCatchTest2() {
    Scanner myScanner = new Scanner(System.in);
//    int[] zahlen = new int[100]; // Mengenkonstrukt
//    int maxIndex = 0;
    ArrayList<Integer> zahlen = new ArrayList<>(); // Mengenkonstrukt

    while (true) {
      try {
        System.out.print("Zahl bitte eingeben (0 für Beenden): ");
        int zahl = myScanner.nextInt();
        if (zahl == 0) {
          break;
        }
        zahlen.add(zahl);
      } catch (InputMismatchException ex) {
        System.out.println("Falsche Eingabe!");
        myScanner.nextLine(); // Falsche Eingabe wegscannen
      }
    }
    System.out.println("Alle eigegeben Zahlen: " + zahlen);
  }

}

//class MyClass { }
//interface MyInterface { }
//enum MyEnum { }
//@interface MyAnnotation { }
class Person {
}
