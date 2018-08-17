/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video82;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author gleez
 */
public class Video82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Marco_Layout marco = new Marco_Layout(); 
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        marco.setVisible(true); 
        
    }
    
}

class Marco_Layout extends JFrame{
    public Marco_Layout(){
        setTitle("Prueba Acciones"); 
        setBounds(600,350,600,300); 
        Panel_Layout lamina = new Panel_Layout(); 
        //lamina.setLayout(new FlowLayout(FlowLayout.CENTER,75,200)); 
        add(lamina); 
        
    }
}

class Panel_Layout extends JPanel{
    public Panel_Layout(){
        setLayout(new BorderLayout()); 
        add(new JButton("Amarillo"), BorderLayout.NORTH); 
        add(new JButton("Rojo"), BorderLayout.SOUTH); 
        add(new JButton("Azul"), BorderLayout.WEST); 
    }
}