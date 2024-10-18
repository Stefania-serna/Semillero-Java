import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Intefaz extends JFrame {

    private JButton botonAbrir;
    private JButton botonGuardar;
    private JTextArea cuadroTexto;

    public Intefaz() {
        setTitle("Stefania SP");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        addEncabezado();
        cuadroTexto = new JTextArea();
        cuadroTexto.setFont(new Font("Arial", Font.PLAIN, 20));
        cuadroTexto.setLineWrap(true);
        add(cuadroTexto);

        JScrollPane scroll = new JScrollPane(cuadroTexto);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setPreferredSize(new Dimension(700, 600));
        add(scroll);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // Esto ayuda a centra la pagina
        funcionBotonAbrir();
        funcionBotonGuardar();
        setVisible(true);
    }

    private void addEncabezado() {
        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new BoxLayout(panelSuperior, BoxLayout.X_AXIS));

        JLabel titulo = new JLabel("Bloc de notas");
        titulo.setFont(new Font("Arial", Font.BOLD, 40));
        panelSuperior.add(titulo);

        botonAbrir = new JButton("Abrir");
        botonGuardar = new JButton("Guardar");

        panelSuperior.add(new JPanel());
        panelSuperior.add(botonAbrir);
        panelSuperior.add(botonGuardar);

        add(panelSuperior);

    }

    private File leerArchivo() {
        JFileChooser selector = new JFileChooser();
        selector.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int seleccion = selector.showSaveDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            return selector.getSelectedFile();
        }
        return null;
    }

    private void funcionBotonAbrir() {
        botonAbrir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                File archivo = leerArchivo();
                StringBuilder sb = new StringBuilder();
                String linea;
                try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                    while ((linea = reader.readLine()) != null) {
                        sb.append(linea).append("\n");

                    }
                    cuadroTexto.setText(sb.toString());
                } catch (Exception error) {
                    System.out.println("Error " + error);
                }
            }
        });
    }

    private void funcionBotonGuardar() {
        botonGuardar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                File archivo = leerArchivo();

                try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo))) {
                    escritor.write(cuadroTexto.getText());
                } catch (Exception error) {
                    System.out.println("Error " + error);
                }
            }
        });
    }

}
