//Programa que compara 2 numeros y nos indica cual es el mayor de ellos.


import java.util.Scanner;

public class Programa16 
{
    public static void main(String[] args)
    {

        Scanner entrada= new Scanner(System.in);
        int a;
        int b; 
        
        System.out.println("********Comparemos numeros*******");
        System.out.print("Ingrese el primer numero crack: ");
        a = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        b = entrada.nextInt();

        if (a < b)
        System.out.printf( "El Segundo numero es el mayor. ", b);
        if (b < a)
        System.out.printf("El Primero es el mayor.", a);
        if (a == b)
        System.out.printf("Los numeros son iguales ");


    









    }





    
}
