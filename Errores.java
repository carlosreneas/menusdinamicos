
/**
 * Write a description of class Errores here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Errores
{
    // instance variables - replace the example below with your own
    private Integer x, y;

    /**
     * Constructor for objects of class Errores
     */
    public Errores()
    {
        this.x = 6;
        this.y = 3;
        
    }
    public void ejecutarDivision(){
        // initialise instance variables
        try{
            Integer d = dividir(this.x, this.y);
            System.out.println(d);
        }catch(Exception e){
            System.out.println("Miercoles no sabes dividir.  0 es :(");
        }
    }
    
    public void setX(Integer x){
        this.x = x;
    }
    
    public void setY(Integer y){
        this.y = y;
    }

    public Integer dividir(Integer x, Integer y)
    {
        // put your code here
        
            return x / y;
        
    }
    
    public void lectura(String archivo){
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
