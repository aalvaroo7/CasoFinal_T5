// En el archivo HerramientasAnalisisNumerico.java
package  nummeros;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HerramientasAnalisisNumerico extends JFrame {
    public HerramientasAnalisisNumerico() {
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

        // Aquí puedes agregar los ActionListener para los botones

        getContentPane().add(buttonPanel);
        setVisible(true);
    }
}