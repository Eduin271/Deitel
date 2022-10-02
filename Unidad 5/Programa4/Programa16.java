// Programa que grafica numeros entre 1 y 30


import java.util.Scanner;

public class Programa16{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num = 0; 
        int conta = 1;
       // System.out.println(" y se imprimira un histograma horizontal.\n");
       // System.out.print("\nIntroduzca cinco enteros entre 1 y 30");
       // num= entrada.nextInt();
        while (conta <=5 )
        {
            System.out.printf("\nPor favor introduzca el numero %d:\n ", conta);
            num= entrada.nextInt();

            if (num>=1 && num<=30 ){
                for ( int i = 1; i <= num; i++ )
                 System.out.print("*");

                System.out.println();
                conta++;

            }
        

        }




    }


}