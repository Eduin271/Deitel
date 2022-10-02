/*El programa nomara tres enteros, los sumara, multiplicara, sacara proedio y le indicara 
 cual es el mayor de los tres digitos ingresados*/

 import java.util.Scanner;

public class Programa17 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int pr;
        int sg;
        int tr;
        int porciento;
        
        System.out.println("********Calculo variado***********");
        System.out.print("Ingrese el primer numere: ");
        pr= entrada.nextInt();
        System.out.print("Ingrse el segunde numere: ");
        sg= entrada.nextInt();
        System.out.print("Ingrese el ultime numere: ");
        tr= entrada.nextInt();
        System.out.printf("La suma es: %d%n ", (pr + sg + tr));
        System.out.printf("La multiplicación es: %d%n ", (pr * sg * tr));
        porciento= (pr + sg + tr)/3;
        System.out.printf("La Promedio es: %d%n ", porciento);
        if (pr > sg)
        {
            if (pr > tr)
            System.out.printf("El mayor es: %d%n ", pr);
        }
        if (sg > pr)
        {
            if(sg >tr )
            System.out.printf("El mayor es: %d%n ", sg);
        }
        if (tr > pr)
        {
            if(tr > sg)
            System.out.printf("El mayor es: %d%n ", tr);


        }
            

    }

    
}
