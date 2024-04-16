// En el archivo Main.java
import sort.QuickSort;
import Analisis_genes.AnalisisGenomico;
import Gestión_de_Información_Científica.GestionInformacionCientifica;
import nummeros.HerramientasAnalisisNumerico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("UAX - Gestión Científica");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.LIGHT_GRAY);

        JLabel titleLabel = new JLabel("UAX", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setBackground(Color.LIGHT_GRAY);

        JButton button1 = new JButton("Análisis Genómico");
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton button2 = new JButton("Herramientas de Análisis Numérico");
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton button3 = new JButton("Gestión de Información Científica");
        button3.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton button4 = new JButton("Salir");
        button4.setAlignmentX(Component.CENTER_ALIGNMENT);

        buttonPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        buttonPanel.add(button1);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        buttonPanel.add(button2);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        buttonPanel.add(button3);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        buttonPanel.add(button4);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AnalisisGenomico();
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new HerramientasAnalisisNumerico();
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new GestionInformacionCientifica();
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        mainPanel.add(Box.createRigidArea(new Dimension(0, 100)));
        mainPanel.add(titleLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        mainPanel.add(buttonPanel);

        frame.getContentPane().add(mainPanel);
        frame.setVisible(true);

        // Crear un array de Integer para ordenar
        Integer[] array = {5, 3, 7, 1, 2, 8, 6, 4};

        // Crear una instancia de QuickSort
        QuickSort quickSort = new QuickSort();

        // Ordenar el array usando QuickSort
        Integer[] sortedArray = quickSort.sort(array);

        // Imprimir el array ordenado
        for (Integer num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}