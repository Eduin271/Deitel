
public class Factura{

    //Definimos variables de instacia 
    private String pieza; //variable que almacena el produto.
    private String dsp_pieza; //variable que almacena la descripción produto.
    private int cantidad;  //variable que almacena la cantidad de produto.
    private double precio; //variable que almacena el precio del  produto.
    double total= 0;

    //Constructor 
    public Factura(String pie ,String dsp_pie, int cant, double prec ){
        this.pieza = pie; 
        this.dsp_pieza = dsp_pie;
        this.cantidad = cant; 
        this.precio = prec; 

        

    }//Cierre de constructor. 



    // Metodo
    public void establecerpieza(String pieza){
        this.pieza = pieza;

    }   

    public String obtenerpieza()
    {
         return pieza;



     }

    public void establecerdsp_pieza(String dsp_pieza){
        this.dsp_pieza = dsp_pieza;

    }
    public String obtenerdsp_pieza()
    {
         return dsp_pieza;



    }



    public void establecercantidad(int cantidad){
        this.cantidad = cantidad;

    }
    public int obtenercantidad()
    {
         return cantidad;



    }


    public void establecerprecio(double precio){
        this.precio = precio;

    }

    public double obtenerprecio()
    {
         return precio;



    }

    


    //Metodo obtener monto de factura.

    public void montofactura(double total){
     if (cantidad > 0)
        {
            total= precio*cantidad; 
        }
        else {
            total= 0.0;
        }  

    }
    
    public void establecermontofactura(double total){
        this.total = total;

    }

    public double obtenermontofactura()
    {
        return total;
    }
    

}