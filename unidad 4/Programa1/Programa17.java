 
 /* Progama que calcula la cantidad  litros por kilometro recorrido.
*/ 

import java.util.Scanner;

public class Programa17{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        double total = 0;
        double registro= 0;
        int contar = 0; 

        System.out.print("ingrese los kilometros ó -1 para cancelar:  ");
        contar= entrada.nextInt();
    
        while (contar != -1)
        {
            
            System.out.print("Ingrese la cantidad de litros suministrados: ");
            int litros = entrada.nextInt();

            /*registro = (double)contar / (double)litros;
            total = registro + registro;
            registro = registro++; */
            registro= (double)contar / (double)litros;
            System.out.printf("Los kilometros por litro son: %.2f", registro );
            registro = registro++;
            total = total + registro;
            
            System.out.println("\nIngrese los kilometros o -1 para cancelar: ");
            contar = entrada.nextInt();
            

        }
        
        
         System.out.printf("Total los kilometros por litro son: %.2f ", total );

    
    }











}

