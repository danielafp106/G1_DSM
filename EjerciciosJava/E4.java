import java.util.Scanner;
public class E4 {
   public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("-------------------------------------");
    System.out.println(" COORDENADAS EN EL PLANO CARTESIANO");
    System.out.println("-------------------------------------");
    System.out.println("Ingrese cuantos puntos desea procesar:");
    int n = leer.nextInt();
    int primero = 0;
    int segundo = 0;
    int tercero = 0;
    int cuarto = 0;
    String[] sCoord = new String[2];
    int[] coordenada = new int[2];
    for (int i = 0; i < n; i++) {
      System.out.println("Ingrese la coordenada #"+(i+1)+" [formato -> x,y]: ");
      String punto = leer.next();
      punto = punto.trim(); //quitando espacios
      sCoord = punto.split(","); //Convrtiendo en array
      coordenada[0]=Integer.parseInt(sCoord[0]);
      coordenada[1]=Integer.parseInt(sCoord[1]);
      if(coordenada[0]>0)
      {
          //I o IV
          if(coordenada[1]>0)
          {
              primero++; //(+,+) I
          }
          else{
              cuarto++; //(+,-) IV
          }

      }
      else{
          //II o III
          if(coordenada[1]>0){
              segundo++; //(-,+) II
          }
          else{
              tercero++; //(-,-) III
          }
      }
    }
    System.out.println("-------------------------------------");
    System.out.println("PRIMER CUADRANTE: " + primero +" coordenadas");
    System.out.println("SEGUNDO CUADRANTE: " + segundo +" coordenadas");
    System.out.println("TERCER CUADRANTE: " + tercero +" coordenadas");
    System.out.println("CUARTO CUADRANTE: " + cuarto +" coordenadas");
    leer.close();
  } 
}
