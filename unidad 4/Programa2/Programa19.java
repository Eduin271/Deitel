//Calculadora de comisiones.
// Programa calculara las comisiones que debera pagar una empresa a sus empleados.

import java.util.Scanner;

public class Programa19{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        Double pre=0.0d;
        Double total= 0.0d;
        int produc= 2;

        System.out.printf("Ingrese el precio del artículo 1  o precione -1 para cancelar:  ");
        pre = entrada.nextDouble();

        while (pre != -1){
            total= total + pre;
            System.out.printf("%nIngrese el precio del artículo %d  o  presione -1 para cancelar: ", produc++);
            pre = entrada.nextDouble();
            pre = pre++;
            
        }
        
        System.out.printf("La comision mas el sueldo del empleado sera: %.2f", (total * 0.09)+200);



    }




}

