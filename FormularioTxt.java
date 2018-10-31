import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FormularioTxt extends JFrame 
implements ActionListener
{
    private JMenuBar mb;
    
    private String archivo;
    /**
     * Constructor for objects of class Formulario
     */
    public FormularioTxt()
    {
        archivo = "archivo.txt";
        String cadena;
 
        setLayout(null);
        mb=new JMenuBar();
        setJMenuBar(mb);

        try{
            FileReader f = new FileReader(archivo);
            BufferedReader b = new BufferedReader(f);
            while((cadena = b.readLine())!=null) {
                String[] datos = cadena.split(",");
                JMenu menu1 = new JMenu(datos[0]);
                mb.add(menu1);
                //cadena
                for(int i = 1; i < datos.length; i ++){
                    JMenuItem mi1=new JMenuItem(datos[i]);
                    mi1.addActionListener(this);
                    menu1.add(mi1);
                }
                
                System.out.println(cadena);
            }
            b.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

         setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        
    }

}
