// Programa que nos dira si un numero es par o impar

import java.util.Scanner;


public class Programa25
{

    public static void main(String[] args)
    {
         Scanner entrada= new Scanner(System.in);
         int numero; 
         int res;
         System.out.println("****** Par/impar Programa*****");
         System.out.print("Ingrse el numero que decea comprobar: ");
         numero= entrada.nextInt();
         res= numero%2;
         if (res != 0)
         System.out.println(" El numero es par impar.");
         if (res == 0 )
         System.out.println("El numero es par.");


        



    }

    
}
