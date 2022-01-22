import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("-------------------------------------");
    System.out.println("     NOTAS DE ALUMNOS");
    System.out.println("-------------------------------------");
    int[] notas = new int[10];
    int aprobados = 0;
    int reprobados = 0;
    for (int i = 0; i < 10; i++) {
      System.out.println("Ingrese la nota del alumno #" + (i + 1) + ":");
      notas[i] = leer.nextInt();
      if (notas[i] >= 7) {
        aprobados++;
      } else {
        reprobados++;
      }
    }
    System.out.println("-------------------------------------");
    System.out.println("ALUMNOS APROBADOS: " + aprobados + " alumnos.");
    System.out.println("ALUMNOS REPROBADOS: " + reprobados + " alumnos.");
    leer.close();
  }
}