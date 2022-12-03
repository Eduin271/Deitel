
import java.util.Scanner;

public class Ejercicio_6_18{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Este programa usted ingresara un numero ");
        System.out.println("y se imprimira un cuadro con ese numero de filas y columnas");
        int lado;
        Obj_6_18 miobjeto =new Obj_6_18();
        System.out.print("Por favor introduzca un numero: ");
        lado = entrada.nextInt();
        miobjeto.Cuadrado(lado);
          

    }
    
}