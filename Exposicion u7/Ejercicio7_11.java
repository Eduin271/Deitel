
public class Ejercicio7_11{


    public static void main(String[] args)
    {
        int[] cuenta=new int[10];
        
        System.out.println("O no todos los elementos del arreglo son 0");
        
        
        System.out.printf("%s%8s%n","Indice","valor");
        
        for (int contador =0; contador < cuenta.length;contador++ )
            System.out.printf("%s%8s%n",contador,cuenta);


    }


}