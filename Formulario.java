import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Formulario extends JFrame implements ActionListener
{
    
    private JMenuBar mb;
    private JMenu menu1, menu2;
    private JMenuItem mi1,mi2,mi3;
    /**
     * Constructor for objects of class Formulario
     */
    public Formulario()
    {
        // initialise instance variables
         setLayout(null);
         mb=new JMenuBar();
         setJMenuBar(mb);
         menu1=new JMenu("Opciones");
         mb.add(menu1);
         
         menu2=new JMenu("Opciones 2");
         mb.add(menu2);
         mi1=new JMenuItem("Rojo");
         mi1.addActionListener(this);
         menu1.add(mi1);
         mi2=new JMenuItem("Verde");
         mi2.addActionListener(this);
         menu1.add(mi2);
         mi3=new JMenuItem("Azul");
         mi3.addActionListener(this);
         menu2.add(mi3); 
         
         setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
         Container f=this.getContentPane();
         if (e.getSource()==mi1) {
             f.setBackground(new Color(255,0,0));
         }
         if (e.getSource()==mi2) {
             f.setBackground(new Color(0,255,0));
         }
         if (e.getSource()==mi3) {
             f.setBackground(new Color(0,0,255));
         }
    }

    
}
