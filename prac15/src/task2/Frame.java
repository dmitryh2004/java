package task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {
    JPanel panel = new JPanel();
    JTextArea jta = new JTextArea(8, 30);
    JComboBox<String> combo;
    DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<>();
    Frame() {
        super("Country choose menu");
        setSize(new Dimension(400, 400));

        comboModel.addElement("Australia");
        comboModel.addElement("China");
        comboModel.addElement("England");
        comboModel.addElement("Russia");

        combo = new JComboBox<>(comboModel);
        combo.setSize(200, 50);
        combo.addActionListener(this::comboBoxActionPerformed);

        jta.setSize(new Dimension(350, 100));
        jta.setLineWrap(true);
        jta.setText("Австралия - страна, расположенная в Южном полушарии на одноименном континенте.");

        panel.setLayout(new FlowLayout());
        panel.add(combo);
        panel.add(jta);
        add(panel);
        setVisible(true);
    }

    private void comboBoxActionPerformed(ActionEvent e) {
        JComboBox<?> comboBox = (JComboBox<?>) e.getSource();
        Object o = comboBox.getSelectedItem();
        if (String.valueOf(o).equals("Australia"))
        {
            jta.setText("Австралия - страна, расположенная в Южном полушарии на одноименном континенте.");
        }
        else if (String.valueOf(o).equals("China"))
        {
            jta.setText("Китай - страна Северного полушария, расположенная в Азии.");
        }
        else if (String.valueOf(o).equals("England"))
        {
            jta.setText("Англия - страна Северного полушария, расположенная в Европе.");
        }
        else if (String.valueOf(o).equals("Russia"))
        {
            jta.setText("Россия - страна Северного полушария, расположенная в Евразии.");
        }
        jta.revalidate();
    }
}
