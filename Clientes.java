import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Write a description of class Clientes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Clientes extends JFrame
{
   
    public Clientes()
    {
        // initialise instance variables
      setTitle("Lista de datos");
      setSize(500,300);
      setLayout(new GridLayout(1,0));  
      String[] columnNames = {"Nombre", "Apellido", "Pasatiempo", "Años de Practica", "Soltero(a)"}; 
      Object[][] data = {{"Mary",   "Campione", "Esquiar", new Integer(5), new Boolean(false)},
            {"Lhucas", "Huml",     "Patinar", new Integer(3), new Boolean(true)},
            {"Kathya", "Walrath",  "Escalar", new Integer(2), new Boolean(false)},
            {"Marcus", "Andrews",  "Correr",  new Integer(7), new Boolean(true)},
            {"Angela", "Lalth",    "Nadar",   new Integer(4), new Boolean(false)}
        };  

      JTable table = new JTable(data, columnNames); 
      table.setPreferredScrollableViewportSize(new Dimension(500, 70));
      table.setFillsViewportHeight(true);

      JScrollPane scrollPane = new JScrollPane(table);
      getContentPane().add(scrollPane);

      setVisible(true);
    }

    
}
