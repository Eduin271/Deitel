// Programa muestra Suma, Resta, Multiplicación y Divisón.


import java.util.Scanner;
public class Programa15 


{   
    public static void main (String[] args)
    
    
    {
        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;
        System.out.println("***** Calculadora Operaciones Basicas******");
        System.out.print("Ingrese el primer numero a operar:  ");
        num1= entrada.nextInt();
        System.out.print("Ingrese el Segundo numero a Operar: ");
        num2 =entrada.nextInt();
        System.out.printf("La suma de dichos numeros es:%d%n ",(num1 + num2));
        System.out.printf("La Multiplicación de dichos numeros es:%d%n",(num1 * num2));
        System.out.printf("La resta de dichos numeros es: %d%n",(num1 - num2));
        System.out.printf("La División de dichos numeros es: %d%n",(num1 / num2));


    }



}