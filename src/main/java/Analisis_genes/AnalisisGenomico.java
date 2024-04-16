package Analisis_genes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class AnalisisGenomico extends JFrame {
    private contadorgenes contadorGenes;
    private CombinacionesGenetica combinacionesGenetica;
    private JTextField dnaField;
    private JTextField genesField;

    public AnalisisGenomico() {
        setTitle("Análisis Genómico");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        dnaField = new JTextField();
        dnaField.setMaximumSize(new Dimension(Integer.MAX_VALUE, dnaField.getPreferredSize().height));
        JButton button1 = new JButton("Contar genes");

        genesField = new JTextField();
        genesField.setMaximumSize(new Dimension(Integer.MAX_VALUE, genesField.getPreferredSize().height));
        JButton button2 = new JButton("Calcular combinaciones genéticas");

        panel.add(new JLabel("Introduce la cadena de ADN:"));
        panel.add(dnaField);
        panel.add(button1);
        panel.add(new JLabel("Introduce la cadena de genes:"));
        panel.add(genesField);
        panel.add(button2);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contadorGenes = new contadorgenes(dnaField.getText());
                JOptionPane.showMessageDialog(null, "Número de genes: " + contadorGenes.countGenes());
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                combinacionesGenetica = new CombinacionesGenetica(new ArrayList<>(Arrays.asList(genesField.getText().split(""))));
                JOptionPane.showMessageDialog(null, "Combinaciones genéticas: " + combinacionesGenetica.calculateCombinations(2).toString());
            }
        });

        getContentPane().add(panel);
        setVisible(true);
    }
}