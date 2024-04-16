// En el archivo HerramientasAnalisisNumerico.java
package  nummeros;
// En el archivo HerramientasAnalisisNumerico.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class HerramientasAnalisisNumerico extends JFrame {
    private operaciones_numeros operacionesNumeros;

    public HerramientasAnalisisNumerico() {
        operacionesNumeros = new operaciones_numeros();

        setTitle("Herramientas de Análisis Numérico");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JButton button1 = new JButton("Sumatoria y Listado de Números");
        JButton button2 = new JButton("Cálculo de Potencias y Máximos");

        buttonPanel.add(button1, gbc);
        buttonPanel.add(button2, gbc);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Sumatoria: " + operacionesNumeros.sum(10) + "\nListado de números: " + operacionesNumeros.listNumbers(1, 10).toString());
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Potencia: " + operacionesNumeros.power(2, 3) + "\nMáximo: " + operacionesNumeros.max(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5))));
            }
        });

        getContentPane().add(buttonPanel);
        setVisible(true);
    }
}