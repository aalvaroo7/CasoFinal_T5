import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
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
        JButton button2 = new JButton("Cálculo de Combinaciones Genéticas");
        JButton button4 = new JButton("Salir");
        JButton button3 = new JButton("Listado de Números de Genes"); // Nuevo botón

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        buttonPanel.add(button1, gbc);
        buttonPanel.add(button2, gbc);
        buttonPanel.add(button3, gbc);
        buttonPanel.add(button4, gbc); // Agregar el nuevo botón al panel

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

        button4.addActionListener(new ActionListener() { // ActionListener para el nuevo botón
            public void actionPerformed(ActionEvent e) {
                String dna = JOptionPane.showInputDialog("Introduce una cadena de ADN (ejemplo: ATGCGTATGAGCTAGCATG)");
                List<Integer> geneNumbers = listGeneNumbers(dna);
                JOptionPane.showMessageDialog(null, "Lista de números de genes: " + geneNumbers);
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

    public static List<Integer> listGeneNumbers(String dna) { // Nueva función
        Map<Character, Integer> geneToNumber = new HashMap<>();
        geneToNumber.put('A', 1);
        geneToNumber.put('T', 2);
        geneToNumber.put('G', 3);
        geneToNumber.put('C', 4);

        List<Integer> geneNumbers = new ArrayList<>();
        for (char gene : dna.toCharArray()) {
            geneNumbers.add(geneToNumber.get(gene));
        }

        return geneNumbers;
    }
}