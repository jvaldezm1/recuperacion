
package javaapplication19;


public class claseHijaFinal extends EjerciciosFinal {
    int incremento;
        int numero[] = {1,2,3,4,5,6,7};
  public   String nombreClaseHija;
   public String cantidadEjercicios;
  
   public String muestra (String nombreClaseHija,String cantidadEjercicios){
   String resultado;
   resultado = nombreClaseHija + cantidadEjercicios ;
   return resultado;
 
   }
   
   
   public int solucionExamen(int numero){
 
while (numero!=100) {	
    
}	  
  if (esImpar(incremento)) {
    System.out.println(incremento);
    numero++;
  }			
  incremento++; 
  return 0;
}

    private boolean esImpar(int incremento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   }   

