
import java.util.Scanner;

public class Test03 {

  public static void main(String[] args) { // die main-Methode
    start();
    method1();
    end();
  }
  public static void start() {
    System.out.println("########################################################");
    System.out.println("#                       Test 3                         #");
    System.out.println("########################################################");
  }

  public static void end() {
    System.out.println("################### Programmende #######################");
  }
  public static void method1() {

    // Benuztereingabe (Standardeingabe)
    Scanner scanner = new Scanner(System.in);

    System.out.println("1. Zahl bitte eingeben");
    int zahl1 = scanner.nextInt();

    System.out.println("2. Zahl bitte eingeben");
    int zahl2 = scanner.nextInt();

    System.out.println("Zahl 1: " + zahl1);
    System.out.println("Zahl 2: " + zahl2);
    // Alle Operationen durchführen
    // Summe, Differenz, Produkt, Teilung, Modulo
    int sum = zahl1 + zahl2;
    int diff = zahl1 - zahl2;
    int prod = zahl1 * zahl2;
    double div = 1.0 * zahl1 / zahl2; // 10 / 4 = 2 ???
    int mod = zahl1 % zahl2;

    System.out.println("zahl1 + zahl2 = " + sum);
    System.out.println("zahl1 - zahl2 = " + diff);
    System.out.println("zahl1 * zahl2 = " + prod);
    System.out.println("zahl1 / zahl2 = " + div);
    System.out.println("zahl1 % zahl2 = " + mod);
    scanner.close();
  }

}
