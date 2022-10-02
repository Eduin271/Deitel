// los dos mayores de 10 numeros 


import java.util.Scanner;

public class Programa23{
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
        int num=0;
        int mayor=0;
        int segun=0;
        for(int i = 0; i<3 ; i++){

            System.out.println("Ingrese el numero " +(i+1)+":");
            num=entrada.nextInt();
            if(i==0){
                mayor=num;
                

            }else if (num > mayor){
                mayor=num;
                      
            }else if ((i+1) < mayor){
                segun = num;  
            }
            
            

        }
        System.out.println("El numero mayor es  " + mayor);
        System.out.println("El segundo numero mayor es  " + segun);
       


    }


}