//Ejercicio converción de temperatura.

import java.util.Scanner;

public class Ejercicio_6_22{
    public static void main(String[] arg){
        Scanner entrada = new Scanner(System.in);
        int opc;
        System.out.println("Elija su opcion de la conversión que desea realizar ");
        System.out.println("Presione 1 para convertir de Centigrados a Fahrenheit");
        System.out.println("Presione cualquier otro numero para convertir de Fahrenheit a Centigrados");
        opc = entrada.nextInt();

        if (opc==1){
            System.out.print("Ingrese la cantidad de grados centigrados:  ");
            double grados= entrada.nextDouble();
            System.out.printf("%.2f grados Centigrados son %.2f grados Fahrenheit\n", grados, fahrenheit(grados));
        }else {
            System.out .print("Ingrese la cantidad de grados Fahrenheit: ");
            double grados=entrada.nextDouble();
            System.out.printf("%.2f grados Fahrenheit son %.2f grados Centigrados\n", grados, centigrados(grados));
        }

    }
    public static double centigrados(double fahrenheit) {
        double centigrados = 5.0 / 9.0 * (fahrenheit - 32);
        return centigrados;
       }
       
       public static double fahrenheit(double centigrados) {
        double fahrenheit = 9.0 / 5.0 * centigrados + 32;
        return fahrenheit;
       }




}