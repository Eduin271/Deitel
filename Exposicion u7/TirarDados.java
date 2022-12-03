import java.util.Random;

public class TirarDados 
{   private int cantDados;
    private int[] frecuencia;
    private int cantAtirar;

    public TirarDados(int cantDados,int cantAtirar)
    {
        this.cantDados = cantDados;
        this.cantAtirar = cantAtirar;
        frecuencia = new int [6*cantDados-(cantDados-1)];
        
    }

    public void lanzarDados()
    {   Random numeroAleatorio = new Random();
        int suma = 0;
        for(int i =1 ; 1<=cantAtirar; i++)
        {
            for (int j =1; 1<=cantDados; j++)
            {
                
                suma += numeroAleatorio.nextInt(6);
                

            }
            ++frecuencia[ suma]; 
            suma = 0; 

        }

    }
    public void mostrarFrecuencia()
    {
        for(int i = 0; i < frecuencia.length; i++)
        {
            System.out.println((i + cantDados)+"Se ha dado: " + frecuencia[i]);

        }
    }



    
}
