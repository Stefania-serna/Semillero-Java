package Practica;

import javax.swing.*;
import java.awt.*;


public class Main {

    public static void main(String[] args) {
        JFrame ventana=new JFrame();
        JLabel titulo=new JLabel(" Blog de Notas", JLabel.CENTER);

        ventana.setLayout(new GridLayout(2,1)); 
        ventana.add(titulo);

        JPanel contenedor1=new JPanel();
        contenedor1.setLayout(new GridLayout(1,2));
        JTextArea texto=new JTextArea();

        contenedor1.add(texto);

        JPanel contenedor2=new JPanel();
        contenedor2.setLayout(new GridLayout(2,1));

        JButton boton=new JButton("Guardar" );
        JButton boton2=new JButton("Salir");

        contenedor2.add(boton);
        contenedor2.add(boton2);

        contenedor1.add(contenedor2);

        ventana.add(contenedor1);
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ventana.pack(); 
        ventana.setVisible(true);
        
    }
}
