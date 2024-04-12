import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);

        JLabel label = new JLabel("UAX", SwingConstants.CENTER);
        JPanel panelUAX = new JPanel();
        panelUAX.setPreferredSize(new Dimension(300, 300)); // Aumenta el tamaño aquí
        panelUAX.setBackground(Color.BLUE);
        panelUAX.add(label);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
        panel.setBackground(Color.GRAY);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.PAGE_AXIS));
        buttonPanel.setBackground(Color.GRAY);

        JButton button1 = new JButton("Conteo de Genes");
        JButton button2 = new JButton("Cálculo de Combinaciones Genéticas");
        JButton button3 = new JButton("Salir");

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dna = "ATGCGTATGAGCTAGCATG";
                JOptionPane.showMessageDialog(null, "Number of genes: " + countGenes(dna));
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int generations = 2;
                List<String> initialGenes = Arrays.asList("A", "a");
                List<String> combinations = calculateCombinations(initialGenes, generations);
                JOptionPane.showMessageDialog(null, "Genetic combinations for " + generations + " generations: " + combinations);
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);

        panel.add(Box.createHorizontalGlue());
        panel.add(buttonPanel);

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(panelUAX, BorderLayout.WEST); // Añade el panelUAX directamente al marco en la posición oeste
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static int countGenes(String dna) {
        if (dna.isEmpty()) {
            return 0;
        } else if (dna.startsWith("ATG")) {
            return 1 + countGenes(dna.substring(3));
        } else {
            return countGenes(dna.substring(1));
        }
    }

    public static List<String> calculateCombinations(List<String> genes, int generations) {
        if (generations == 1) {
            return genes;
        } else {
            List<String> newGenes = new ArrayList<String>();
            for (String gene : genes) {
                newGenes.add(gene + "A");
                newGenes.add(gene + "a");
            }
            return calculateCombinations(newGenes, generations - 1);
        }
    }
}