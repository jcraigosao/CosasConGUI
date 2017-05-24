/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplogui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;
import javax.swing.*;


/**
 *
 * @author Estudiante
 */

public class EjemploGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        JFrame frame= new JFrame();
        Image icon= Toolkit.getDefaultToolkit().getImage("icon.gif");
        frame.setIconImage(icon);
        JPanel panel= (JPanel) frame.getContentPane();
        panel.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300, 200));
        frame.setLayout (new FlowLayout());
        JLabel label= new JLabel("Que cosa tan aspera");
        JTextField field= new JTextField("Que hizo");
        Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(dim.width/2-frame.getSize().width/2,
                        dim.height/2-frame.getSize().height/2);
        frame.setTitle("A frame");
        JButton boton1= new JButton();
        boton1.setText("Yo soy el cantante");
        boton1.setBackground(Color.BLUE);
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(field);
        frame.add(boton1);
        Listener escuchador= new Listener(field);
        field.getText();
        
        JButton boton2= new JButton();
        boton2.setText("Deme click");
        boton2.setBackground(Color.GREEN);
        frame.add(boton2);
        boton2.addActionListener(new Listener(field));
        
        frame.setVisible(true);
        

//  Para crear un cuadro de texto que 
//        String name= JOptionPane.showInputDialog(null, "Cual es su nombre?");
//        int choice= JOptionPane.showConfirmDialog(null, "Do you like care, "+ name+ "?");
//        
//        if(choice==JOptionPane.YES_OPTION){
//            JOptionPane.showInternalMessageDialog(null, "Of course! Who doesn't?");
//        }else{
//            JOptionPane.showMessageDialog(null, "We'll have to agree to disagree.");
//        }
//        
        JRadioButton jrb= new JRadioButton("Student", true);
    }
    
}
