
package Banco;
import java.io.*;

/**
 * @author Bando
 */
public class Monedas {
    
    // Nombre de la moneda
    private String nombre;
    
    // El euro pregunta si es euro o centimos 
    private boolean euro;
    
    // Cantidad de esa moneda
    private int cantidad;
    
    // Total de dinero de esta moneda
    private int dineroTotalEuros;
    
    // Que moneda de centimos es 
    private int centimos;
    
    Monedas(String nombre, boolean euro){
        this.nombre = nombre;
        this.euro = euro;
        
        
        
    }
    
    

    
    // Metodo utilizado para introducir dinero o centimos 
    
    public void setCantidad(int cantidad) {
        
        this.cantidad = cantidad;
        
        
        
        
    }

    public void setCentimos(int centimos) {
        this.centimos = centimos;
    }
    
    
    


    @Override
    public String toString() {
        
        
        
        
        return "  Tienes " +cantidad +" monedas de "+nombre + " : Euros -> " + dineroTotalEuros +" \n";
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEuro() {
        return euro;
    }

    public int getCantidad() {
        
        return cantidad;
    }

    public int getDineroTotalEuros() {
        return dineroTotalEuros;
    }

    public int getCentimos() {
        return centimos;
    }
    
    
    public String mostrar(File file){
       
       file = new File("file.txt");
       
       int cantidad = 0;
       
       try{
       FileReader fr = new FileReader(file);
       BufferedReader br = new BufferedReader(fr);
       
       String str = br.readLine();
       int entero = Integer.parseInt(str);
       
       cantidad = entero;
       
       br.close();
       
       
       
       
       
       }
       catch(IOException e){
                   System.out.println("Error en la funcion mostrar");
               }
       return "Tienes una cantidad de "+ cantidad +" monedas de "+this.nombre ;
   }
    
    
    

    
    
    
    
    
}
