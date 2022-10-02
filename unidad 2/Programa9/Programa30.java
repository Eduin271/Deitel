// Programa encargado de separar dijitos 


import java.util.Scanner;

public class Programa30{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int numero;
        int a, e, i, o, u;
         
        System.out.print("Ingrese el numero que desea separar: ");
        numero= entrada.nextInt();
             a= numero % 10;
             e= (numero/10) % 10;
             i= (numero/100) % 10;
             o= (numero/1000) % 10;
             u=(numero/10000) % 10;
         
         System.out.printf("Los digitos son:" +"\t"+ u + "\t" + o +"\t"+ i +"\t"+ e +"\t"+ a);

        
         
        







    }





}