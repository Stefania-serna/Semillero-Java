package Parte2;

import javax.swing.*;
import java.awt.*;


public class Main {

    public static void main(String[] args) {
        JFrame ventana=new JFrame();
        JLabel titulo=new JLabel(" Blog de Notas", JLabel.CENTER);

        ventana.setLayout(new GridLayout(1,1)); // se pone antes de agregar algo
        JPanel contenedor1=new JPanel();
        contenedor1.setLayout(new BoxLayout(contenedor1,BoxLayout.Y_AXIS));
        contenedor1.add(titulo);

        ventana.add(contenedor1);
        ventana.setPreferredSize(new Dimension(720,500));
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cierra la ventana
        ventana.pack(); //Encargado de mandar todas las caracteristicas que tiene una ventana
        ventana.setVisible(true);
        
    }
}
