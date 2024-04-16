package nummeros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GestionInformacionCientifica extends JFrame {
    private operaciones_numeros operacionesNumeros;

    public GestionInformacionCientifica() {
        operacionesNumeros = new operaciones_numeros();

        setTitle("Gestión de Información Científica");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JButton button1 = new JButton("Organización de Documentos");
        JButton button2 = new JButton("Búsqueda Eficiente en Textos");

        buttonPanel.add(button1, gbc);
        buttonPanel.add(button2, gbc);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    operacionesNumeros.sortLinesAlphabetically("ruta/al/archivo.txt"); // Reemplaza con la ruta al archivo que deseas ordenar
                    JOptionPane.showMessageDialog(null, "Las líneas del archivo han sido ordenadas alfabéticamente.");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error al ordenar las líneas del archivo.");
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    boolean found = operacionesNumeros.binarySearch("ruta/al/archivo.txt", "palabra a buscar"); // Reemplaza con la ruta al archivo y la palabra que deseas buscar
                    JOptionPane.showMessageDialog(null, found ? "La palabra fue encontrada en el archivo." : "La palabra no fue encontrada en el archivo.");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error al buscar la palabra en el archivo.");
                }
            }
        });

        getContentPane().add(buttonPanel);
        setVisible(true);
    }
}