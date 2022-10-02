//Calcular el producto de enteros impares.



public class Programa12{
    public static void main(String[] args){
        int producto=1;


        for (int i=2; i<=15 ; i++ ){


            if( i % 2 != 0 ){
                producto  *= i;
            }
            
           
    
        }
        System.out.print("El resultado de multiplicar los impares es: " + producto );
    

  
    }

   
    
}