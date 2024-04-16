package nummeros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

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
                try {
                    String input = JOptionPane.showInputDialog("Introduce un número para calcular la sumatoria y el listado de números:");
                    int n = Integer.parseInt(input);
                    JOptionPane.showMessageDialog(null, "Sumatoria: " + operacionesNumeros.sum(n) + "\nListado de números: " + operacionesNumeros.listNumbers(1, n).toString());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, introduce un número válido.");
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String input1 = JOptionPane.showInputDialog("Introduce la base para calcular la potencia:");
                    String input2 = JOptionPane.showInputDialog("Introduce el exponente para calcular la potencia:");
                    int base = Integer.parseInt(input1);
                    int exponent = Integer.parseInt(input2);
                    JOptionPane.showMessageDialog(null, "Potencia: " + operacionesNumeros.power(base, exponent));

                    String input3 = JOptionPane.showInputDialog("Introduce una lista de números separados por comas para encontrar el máximo:");
                    String[] numberStrings = input3.split(",");
                    List<Integer> numbers = new ArrayList<>();
                    for (String numberString : numberStrings) {
                        numbers.add(Integer.parseInt(numberString.trim()));
                    }
                    JOptionPane.showMessageDialog(null, "Máximo: " + operacionesNumeros.max(numbers));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, introduce números válidos.");
                }
            }
        });

        getContentPane().add(buttonPanel);
        setVisible(true);
    }
}