package Programa6;

//Programa imprime asteriscos y mas

 public class Misterio2
{
 public static void main(String[] args)
 {
 int cuenta = 1;

    while (cuenta <= 10) {
    System.out.println(cuenta % 2 == 1 ? "****" : "++++++++");
    ++cuenta;
    }
 }
} // fin de la clase Misterio2