
import java.util.Scanner;

public class PruebaFactura {
    public static void main (String [] args ){
       

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el producto comprado: ");
        String a = entrada.nextLine();
        System.out.println("Ingrese descripcion del producto: ");
        String b = entrada.nextLine();
        System.out.println("Ingrese la cantidad de producto comprado: ");
        int c = entrada.nextInt();
        System.out.println("Ingrese el precio del producto: ");
        Double d = entrada.nextDouble();
        System.out.println(" ________________________________________________ ");
        System.out.println(" ________________________________________________ ");


        Factura factura1 = new Factura(a, b, c, d);
        System.out.printf("El producto comprado es: %s%n", factura1.obtenerpieza());
        System.out.printf("Descripción del producto comprado es: %s%n", factura1.obtenerdsp_pieza());
        System.out.printf("cantidad de producto comprado es: %s%n", factura1.obtenercantidad());
        System.out.printf("Precio de compra  es: %s%n", factura1.obtenerprecio());
        System.out.println("  ");
       System.out.printf("El total a pagar es: %s%n", factura1.obtenerprecio() * factura1.obtenercantidad() );
      // System.out.printf("Precio de compra  es: %s%n", factura1.obtenermontofactura());
      System.out.println(" ________________________________________________ ");

    

    }




}



