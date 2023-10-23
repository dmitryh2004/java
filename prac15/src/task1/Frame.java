package task1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton btnAdd = new JButton("+"),
            btnSub = new JButton("-"),
            btnMul = new JButton("*"),
            btnDiv = new JButton("/");

    JPanel p2;
    Font font = new Font("Times New Roman", Font.BOLD, 20);

    Frame() {
        super("Calculator v1");
        setLayout(new FlowLayout());
        setSize(250, 150);

        p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.setPreferredSize(new Dimension(400, 100));

        add(new JLabel("Number 1"));
        add(jta1);
        add(new JLabel("Number 2"));
        add(jta2);

        p2.add(btnAdd);
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1+x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception exc)
                {
                    JOptionPane.showMessageDialog(null, "Error)", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        p2.add(btnSub);
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1-x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception exc)
                {
                    JOptionPane.showMessageDialog(null, "Error)", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        p2.add(btnMul);
        btnMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1*x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception exc)
                {
                    JOptionPane.showMessageDialog(null, "Error)", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        p2.add(btnDiv);
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1/x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception exc)
                {
                    JOptionPane.showMessageDialog(null, "Error)", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(p2);
        setVisible(true);
    }
}
