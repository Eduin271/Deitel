// El numero mas grande.
/// Prorama calculara el entero mas grande introducido por el usuario.

import java.util.Scanner;

public class Programa21{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero= 0;
        int mayor =0;
        


        for( int i =0 ; i< 10; i++){

            System.out.println("Ingrese un el número "+(i+1)+ ":");
            numero = entrada.nextInt();
            if (i==0 ){
                mayor= numero;

            }
            else if (numero > mayor) {
                mayor=numero;

            }
            
         
        }
        System.out.println("El numero mayor es:  "+ mayor);
        System.out.println("El ultimo numero ingresado es:  "+ numero);
        


    }



}
