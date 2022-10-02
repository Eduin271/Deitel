//El Programa calculara por usted su indice de masa corporal.  


import java.util.Scanner;

public class Programa33 

{
    
    public static void main(String[] args)
    {

        float peso= 0;
        float altura= 0;
        float al= 0;
        float bmi= 0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su peso en Kilogramos: ");
        peso= entrada.nextFloat();
        System.out.print("Ingresa su altura en centimetros ");
        altura= entrada.nextFloat();
        al= altura/100;
        bmi= peso / (al * al) ;
        if (bmi >= 30){
            System.out.println("Ya bajale a la comelona estas obeso.");
        
        }
         else if (bmi >= 25.5 && bmi< 29.9)
            {
                System.out.println("Aun estas a tiempo de hacer dieta, tienes sobre peso");
            }
        
         else if(bmi >= 18.5 && bmi <=25.4){
            System.out.println("Felicidades estas normal, pero no te descuides");

         }
        
         else if(bmi <= 18)
            {
            System.out.println("Deberias alimentarte mejor, tienes bajo peso "); 

            }
            System.out.printf("Tu Indice de masa es:%2.2f ", bmi);

         


    } 


}
