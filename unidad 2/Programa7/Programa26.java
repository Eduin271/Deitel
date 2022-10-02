// Programa que evalua si un numero es multiplo e otro.

import java.util.Scanner;

public class Programa26

{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2; 
        int residuo;
        System.out.println("Verificacion de multiplicidad");
        System.out.print("Ingrese el primer numero: ");
        num1= entrada.nextInt();
        System.out.print("Ingrese el segubdo numero: ");
        num2= entrada.nextInt();
        residuo= num1 % num2;
        if ( residuo != 0 )
            System.out.println("El numero no es multiplo");
              if (residuo == 0)
                 System.out.println("El numero si es multiplo ");
                 System.out.printf("El resultado de la division es:%d%n", (num1 / num2));





    }

    
}
