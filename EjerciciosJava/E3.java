import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("-------------------------------------");
    System.out.println("     NÚMEROS DIVISIBLES ENTRE SÍ");
    System.out.println("-------------------------------------");
    System.out.println("Ingrese el primero número:");
    int n1 = leer.nextInt();
    System.out.println("Ingrese el segundo número:");
    int n2 = leer.nextInt();
    System.out.println("-------------------------------------");
    if (n1 % n2 == 0) {
      System.out.println("    " + n1 + " es divisible entre " + n2);
    } else {
      System.out.println("    " + n1 + " NO es divisible entre " + n2);
    }
    leer.close();
  }
}
