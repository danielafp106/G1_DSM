import java.util.Scanner;

class E3 {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("-------------------------------------");
    System.out.println("          PARES E IMPARES");
    System.out.println("-------------------------------------");
    System.out.println("Ingrese cuantos números desea ingresar:");
    int n = leer.nextInt();
    int par = 0;
    int impar = 0;
    for (int i = 0; i < n; i++) {
      System.out.println("Ingrese la cantidad #"+(i+1)+": ");
      if (leer.nextInt() % 2 == 0) {
        par++;
      } else {
        impar++;
      }
    }
    System.out.println("-------------------------------------");
    System.out.println("CANTIDAD NUMEROS PARES: " + par);
    System.out.println("CANTIDAD NUMEROS IMPARES: " + impar);
    leer.close();
  }
}
