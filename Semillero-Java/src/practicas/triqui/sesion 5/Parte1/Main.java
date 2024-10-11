package Parte1;

//import java.io.BufferedWriter;
//import java.io.FileWriter;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main{

    public static void main(String[] args) {
    
    //         try(BufferedWriter escritor= new BufferedWriter(new FileWriter("Mina.txt", true))){
    //          escritor.write("\nNueva linea");

    //             }catch(Exception e)
//     {
//         System.out.println("Error" + e);
//     }

        try(BufferedReader lector= new BufferedReader(new FileReader("Mina.txt"))){
           String linea;
           StringBuilder sb=new StringBuilder();
           while ((linea=lector.readLine())!=null) {
                // System.out.println(linea);
                sb.append(linea).append("\n"); //Se recomienda usar esta tecnica, se pone dos veces append porque no hace salto de linea en el primero :)
           }
           System.out.println(sb.toString());
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
}
}



