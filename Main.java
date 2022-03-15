import java.util.*;
import java.util.Scanner;
import static java.lang.Math.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double liczba1 , liczba2;
      System.out.println("wpisz pierwsza liczbe: ");
    liczba1 =scanner.nextDouble();
      System.out.println("wpisz druga liczbe: ");
    liczba2 = scanner.nextDouble();
    double wynik;
    wynik = Math.sqrt(liczba1)+Math.sqrt(liczba2);
    System.out.println(wynik);
    
    
    
  }
}