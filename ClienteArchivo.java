import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

/**
 * Write a description of class Clientes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClienteArchivo extends JFrame
{
   
    public ClienteArchivo()
    {
        // initialise instance variables
      String archivo = "datos.txt";
      setTitle("Lista de datos");
      setSize(500,300);
      setLayout(new GridLayout(1,0));  
      String[] columnNames = {"Nombre", "Apellido", "Pasatiempo", "Años de Practica", "Soltero(a)"}; 
 
      DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
      
      JTable table = new JTable(tableModel); 
      
      
      try{
            FileReader f = new FileReader(archivo);
            BufferedReader b = new BufferedReader(f);
            String cadena = "";
            while((cadena = b.readLine())!=null) {
                String[] datos = cadena.split(",");
                tableModel.addRow(datos);
                System.out.println(cadena);
            }
            b.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
      
      table.setPreferredScrollableViewportSize(new Dimension(500, 70));
      table.setFillsViewportHeight(true);
      
      
      JScrollPane scrollPane = new JScrollPane(table);
      
      
      getContentPane().add(scrollPane);

      setVisible(true);
    }

    
}
