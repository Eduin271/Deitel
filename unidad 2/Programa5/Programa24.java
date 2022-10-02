// Programa que nos indica el mayor de 5 numeros utilizando unicamente condicional si


import java.util.Scanner;

public class Programa24 {

    public static void main(String[] args)
    
    {
        Scanner entrada= new Scanner(System.in);
        int un;
        int dos;
        int tre;
        int cua;
        int cin;

        System.out.println("***** Mayor y Menor entero******");
        System.out.println("Acontinuacion tendras que ingresar 5 numeros capo");
        System.out.print("Primer número: ");
        un= entrada.nextInt();
        System.out.print("Segundo número: ");
        dos= entrada.nextInt();
        System.out.print("Tercer número: ");
        tre= entrada.nextInt();
        System.out.print("Cuarto número: ");
        cua= entrada.nextInt();
        System.out.print("Vale que este es el ultimo : ");
        cin= entrada.nextInt();
        
        if (un >= dos)
        {   
            if(un >= tre)
            {
                if (un >= cua)
                {
                
                  if(un >= cin)
                    System.out.printf("El mayor es: %d%n", un);
                }
            }     
        }

        
        if (dos >= un)
        {  
            if(dos >= tre)
            {
                if (dos >= cua)
                {
                
                  if(dos >= cin)
                    System.out.printf("El mayor es: %d%n", dos);
                }
            }     
        }

        if (tre >= un)
        {   
            if(tre >= dos)
            {
                if (tre >= cua)
                {
                
                  if(tre >= cin)
                    System.out.printf("El mayor es: %d%n ", tre);
                }
            }     
        }

        if (cua >= un)
        {   
            if(cua >= dos)
            {
                if (cua >= tre)
                {
                
                  if(cua >= cin)
                    System.out.printf("El mayor es: %d%n", cua);
                }
            }     
        }

        if (cin >= un)
        {   
            if(cin >= dos)
            {
                if (cin >= tre)
                {
                
                  if(cin >= cua)
                    System.out.printf("El mayor es: %d%n ", cin);
                }
            }     
        }

        if (un <= dos)
        {   
            if(un <= tre)
            {
                if (un <= cua)
                {
                
                  if(un <= cin)
                    System.out.printf("El menor  es: %d%n ", un);
                }
            }     
        }
        if (dos <= un)
        {   
            if(dos <= tre)
            {
                if (dos <= cua)
                {
                
                  if(dos <= cin)
                    System.out.printf("El menor  es: %d%n ", dos);
                }
            }     
        }

        if (tre<= un)
        {   
            if(tre <= dos)
            {
                if (tre <= cua)
                {
                
                  if(tre <= cin)
                    System.out.printf("El menor  es: %d%n ", tre);
                }
            }     
        }

        if (cua <= un)
        {   
            if(cua <= dos)
            {
                if (cua <= tre)
                {
                
                  if(cua <= cin)
                    System.out.printf("El menor  es: %d%n ", cua);
                }
            }     
        }

        if (cin <= un)
        {   
            if(cin <= dos)
            {
                if (cin <= tre)
                {
                
                  if(cin <= cua)
                    System.out.printf("El menor  es: %d%n ", cin);
                }
            }     
        }









    }
}
