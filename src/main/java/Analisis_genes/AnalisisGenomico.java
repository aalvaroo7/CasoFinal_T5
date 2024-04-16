package Analisis_genes;

// En el archivo AnalisisGenomico.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnalisisGenomico extends JFrame {
    private contadorgenes contadorGenes;
    private CombinacionesGenetica combinacionesGenetica;

    public AnalisisGenomico() {
        contadorGenes = new contadorgenes("ATGATGATG"); // Ejemplo de cadena de ADN
        combinacionesGenetica = new CombinacionesGenetica(new ArrayList<>(Arrays.asList("A", "a")));

        setTitle("Análisis Genómico");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JButton button1 = new JButton("Cálculo de Combinaciones Genéticas");
        JButton button2 = new JButton("Conteo de Genes");

        buttonPanel.add(button1, gbc);
        buttonPanel.add(button2, gbc);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, combinacionesGenetica.calculateCombinations(2).toString());
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Número de genes: " + contadorGenes.countGenes());
            }
        });

        getContentPane().add(buttonPanel);
        setVisible(true);
    }
}