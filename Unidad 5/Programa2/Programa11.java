// Programa que calcula el numero menor


import java.util.Scanner;

public class Programa11{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num=0;
        int menor=0;
        int contador= 0; 
        System.out.print("Ingrese la cantidad de datos que quiere procesar: ");
        contador=entrada.nextInt();
        for (int i = 0; i < contador ; i++  ){
            System.out.println("Ingrese el numero %d "+(i+1)+ ":");
            num=entrada.nextInt();
             if (i==0){
                menor=num;
             } else if (num < menor)
                menor=num;

        }
        System.out.print("El numero menor es:  " + menor);

    }



}