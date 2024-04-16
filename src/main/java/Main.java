// En el archivo Main.java

import Analisis_genes.AnalisisGenomico;
import nummeros.GestionInformacionCientifica;
import nummeros.HerramientasAnalisisNumerico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JButton button1 = new JButton("Análisis Genómico");
        JButton button2 = new JButton("Herramientas de Análisis Numérico");
        JButton button3 = new JButton("Gestión de Información Científica");

        buttonPanel.add(button1, gbc);
        buttonPanel.add(button2, gbc);
        buttonPanel.add(button3, gbc);

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

        frame.getContentPane().add(buttonPanel);
        frame.setVisible(true);
    }
}