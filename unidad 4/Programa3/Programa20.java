
 // Calculadora de salario 
// El programa recibira las horas trabajadas de un grupo de empleados y dara su salario bruto.

import java.util.Scanner;

public class Programa20{

    public static void main(String[] args ){

        Scanner entrada = new Scanner(System.in);
        int con=1 ;
        int hora= 0;
        Double cuota = 0.0d;
    
        while (con <= 3){
            ++con;
            System.out.print("\nIngrese la cuota que recibe el empleado: ");
            cuota= entrada.nextDouble();
            System.out.print("Ingrese la cantidad de horas trabajadas: ");
            hora = entrada.nextInt();
            double total=0;

            if (hora >= 40)
            {
                cuota= cuota * 1.5;
                total= cuota * (double)hora;
                System.out.printf("El sueldo del empleado es:%.2f ", total);

            }
            else {
                total= cuota * (double)hora;
                System.out.printf("El sueldo del empleado es:%.2f ", total);


            }

    

            
        }






    }





}
