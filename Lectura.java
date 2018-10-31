
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lectura
{
    
    private String archivo;
    /**
     * Constructor for objects of class Lectura
     */
    public Lectura()
    {
        archivo = "archivo.txt";
        try{
            leerArchivo();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    
    public void leerArchivo() throws FileNotFoundException, IOException{
        String cadena;
       
            FileReader f = new FileReader(archivo);
            BufferedReader b = new BufferedReader(f);
            while((cadena = b.readLine())!=null) {
                
                //cadena
                System.out.println(cadena);
            }
            b.close();
        
    }

    
}
