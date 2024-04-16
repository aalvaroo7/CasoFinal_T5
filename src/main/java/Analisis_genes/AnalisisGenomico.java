package Analisis_genes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnalisisGenomico extends JFrame {
    public AnalisisGenomico() {
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

        // Aquí puedes agregar los ActionListener para los botones

        getContentPane().add(buttonPanel);
        setVisible(true);
    }
}