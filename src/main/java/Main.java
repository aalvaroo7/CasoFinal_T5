import Analisis_genes_ej_7_y_8.contadorgenes;
import Analisis_genes_ej_7_y_8.CombinacionesGenetica;
import Herramientas_de_Análisis_Numérico.operaciones_numeros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        operaciones_numeros numberOperations = new operaciones_numeros();

        JFrame frame = new JFrame("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);

        JLabel label = new JLabel("UAX", SwingConstants.CENTER);
        JPanel panelUAX = new JPanel();
        panelUAX.setPreferredSize(new Dimension(10000, 10000));
        panelUAX.setBackground(Color.BLUE);
        panelUAX.add(label);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());
        buttonPanel.setBackground(Color.GRAY);

        JButton button1 = new JButton("Conteo de Genes");
        JButton button3 = new JButton("Cálculo de Combinaciones Genéticas");
        JButton button4 = new JButton("Suma de Números"); // Nuevo botón
        JButton button2 = new JButton("Salir");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        buttonPanel.add(button1, gbc);
        buttonPanel.add(button3, gbc);
        buttonPanel.add(button4, gbc); // Agregar el nuevo botón al panel
        buttonPanel.add(button2, gbc); // Agregar el botón de "Salir" al final

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dna = JOptionPane.showInputDialog("Introduce una cadena de ADN (ejemplo: ATGCGTATGAGCTAGCATG)");
                contadorgenes geneCounter = new contadorgenes(dna);
                int numberOfGenes = geneCounter.countGenes();
                JOptionPane.showMessageDialog(null, "Number of genes: " + numberOfGenes);
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String initialGenesInput = JOptionPane.showInputDialog("Introduce los genes iniciales (ejemplo: A, a)");
                String generationsInput = JOptionPane.showInputDialog("Introduce el número de generaciones");

                List<String> initialGenes = Arrays.asList(initialGenesInput.split(","));
                int generations = Integer.parseInt(generationsInput);

                CombinacionesGenetica geneticCombinations = new CombinacionesGenetica(initialGenes);
                List<String> combinations = geneticCombinations.calculateCombinations(generations);

                JOptionPane.showMessageDialog(null, "Combinaciones genéticas para " + generations + " generaciones: " + combinations);
            }
        });

        button4.addActionListener(new ActionListener() { // ActionListener para el nuevo botón
            public void actionPerformed(ActionEvent e) {
                String numberInput = JOptionPane.showInputDialog("Introduce un número natural");
                int number = Integer.parseInt(numberInput);
                int sum = numberOperations.sum(number);
                JOptionPane.showMessageDialog(null, "La suma de los números naturales hasta " + number + " es: " + sum);
            }
        });

        frame.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0.5;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        frame.getContentPane().add(panelUAX, c);

        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 0.5;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        frame.getContentPane().add(buttonPanel, c);

        frame.setVisible(true);
    }
}