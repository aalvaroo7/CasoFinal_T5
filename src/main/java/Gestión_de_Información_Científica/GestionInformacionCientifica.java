package Gestión_de_Información_Científica;

import nummeros.operaciones_numeros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class GestionInformacionCientifica extends JFrame {
    private operaciones_numeros operacionesNumeros;


    public String[] sortDates(String[] dateStrings) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date[] dates = new Date[dateStrings.length];
        for (int i = 0; i < dateStrings.length; i++) {
            dates[i] = format.parse(dateStrings[i]);
        }
        Arrays.sort(dates);
        for (int i = 0; i < dates.length; i++) {
            dateStrings[i] = format.format(dates[i]);
        }
        return dateStrings;
    }

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
        JButton button3 = new JButton("Gestión de Fechas");

        buttonPanel.add(button1, gbc);
        buttonPanel.add(button2, gbc);
        buttonPanel.add(button3, gbc);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String filePath = JOptionPane.showInputDialog("Introduce la ruta del archivo que deseas ordenar:");
                    File file = new File(filePath);
                    if (file.exists()) {
                        operacionesNumeros.sortLinesAlphabetically(filePath);
                        JOptionPane.showMessageDialog(null, "Las líneas del archivo han sido ordenadas alfabéticamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "El archivo no existe. Por favor, introduce una ruta válida.");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al ordenar las líneas del archivo.");
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String filePath = JOptionPane.showInputDialog("Introduce la ruta del archivo donde deseas buscar:");
                    File file = new File(filePath);
                    if (file.exists()) {
                        String word = JOptionPane.showInputDialog("Introduce la palabra que deseas buscar:");
                        boolean found = operacionesNumeros.binarySearch(filePath, word);
                        JOptionPane.showMessageDialog(null, found ? "La palabra fue encontrada en el archivo." : "La palabra no fue encontrada en el archivo.");
                    } else {
                        JOptionPane.showMessageDialog(null, "El archivo no existe. Por favor, introduce una ruta válida.");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al buscar la palabra en el archivo.");
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String input = JOptionPane.showInputDialog("Introduce las fechas separadas por comas en formato dd/MM/yyyy:");
                    String[] dateStrings = input.split(",");
                    JOptionPane.showMessageDialog(null, "Fechas ordenadas: " + sortDates(dateStrings));
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, introduce fechas válidas.");
                }
            }
        });

        getContentPane().add(buttonPanel);
        setVisible(true);
    }

}