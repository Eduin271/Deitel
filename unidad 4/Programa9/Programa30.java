// Programa que nos dice si un numero es un palindromo


import java.util.Scanner;

public class Programa30{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int a;
        int num1 = 0;
        int num2 = 0;
        int num3= 0;
        int num4 = 0;
        int num5= 0;

        System.out.println("Introduzca un entero de 5 cifras y le diremos si es un palindromo:");
        a= entrada.nextInt();
       
            while(9 < (a/10000) ){
             System.out.println("El numero debe tener cinco cifras, introduzcalo nuevamente: ");
             a= entrada.nextInt();
    
            }

        
       
        num1= a/10000;
        num2 = (a % 10000)/1000;
        num3 = ((a % 10000)%1000)/100;
        num4 = (((a % 10000) % 1000) % 100)/10;
        num5 = (((a % 10000) % 1000) % 100) %10;
        if (num1 == num5){
            if( num2 == num4)
            System.out.printf("El numero %d efectivamente es un palindromo:", a);
            else 
            System.out.printf("Nel my friend no es palidromo %d ", a);

        }
        else {
            System.out.printf("Nel my friend no es palidromo %d ", a);

        }
            


    }


}