// En este programa vamos a calcular el area, el diametro y el perimetro de un circulo´


import java.util.Scanner;

public class Programa28{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double radio = 0 , r=0, d=0 , p= 0;
        double pi = 3.1416;

        System.out.println("Ingrese el radio del circulo");
        radio= entrada.nextFloat();
        r= pi * (radio * radio);
        System.out.printf("El Area del circulo es: %2.3f " , r  );
        System.out.println("  ");
        d= 2 *radio; 
        System.out.print("El diametro es:  "+ d );
        System.out.println("   ");
        p= 2 * pi * radio;
        System.out.printf("La circunferencia es: %2.3f", p ); 





    }



}