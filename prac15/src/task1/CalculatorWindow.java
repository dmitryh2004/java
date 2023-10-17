package task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorWindow {
    double a = 0;
    double b = 0;
    double res = 0;
    String inputA = "0", inputB = "0";
    String outputResString = "undefined";
    boolean currentEdit = false; //false - A, true - B
    JFrame f;
    JButton[] digits = new JButton[10];
    JButton dot, add, sub, mul, div;
    JButton changeEdit, backspace;
    JPanel panel;
    JLabel outputA, outputB, outputRes;
    JPanel btns;
    JPanel[] btn_row = new JPanel[5];

    public void initFrame() {
        f = new JFrame("Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 600);
        Font font = new Font("Times New Roman", Font.PLAIN, 40);

        panel = new JPanel();
        panel.setBackground(Color.getHSBColor(0.5f,0.5f,0.5f));
        panel.setPreferredSize(new Dimension(600, 600));
        panel.setBounds(0,0,600,600);

        outputA = new JLabel("Число А: " + inputA, JLabel.LEFT);
        outputA.setPreferredSize(new Dimension(400, 30));
        outputA.setOpaque(true);
        outputA.setBackground(Color.getHSBColor(0.2f,0.5f,1));
        outputA.setBorder(BorderFactory.createLineBorder(Color.getHSBColor(0,0,0), 3));
        panel.add(outputA);

        outputB = new JLabel("Число B: " + inputB, JLabel.LEFT);
        outputB.setPreferredSize(new Dimension(400, 30));
        outputB.setOpaque(true);
        outputB.setBackground(Color.getHSBColor(0.33f,0.5f,1));
        outputB.setBorder(BorderFactory.createLineBorder(Color.getHSBColor(0,0,0), 3));
        panel.add(outputB);

        outputRes = new JLabel("Результат: " + outputResString, JLabel.LEFT);
        outputRes.setPreferredSize(new Dimension(400, 30));
        outputRes.setOpaque(true);
        outputRes.setBackground(Color.getHSBColor(0,0.5f,1));
        outputRes.setBorder(BorderFactory.createLineBorder(Color.getHSBColor(0,0,0), 3));
        panel.add(outputRes);

        btns = new JPanel();
        btns.setPreferredSize(new Dimension (500, 450));
        btns.setOpaque(true);
        btns.setBackground(Color.getHSBColor(0.5f,0.5f,0.5f));
        btns.setLayout(new BoxLayout(btns, BoxLayout.Y_AXIS));

        for (int i = 0; i < 5; i++)
        {
            btn_row[i] = new JPanel();
            btn_row[i].setPreferredSize(new Dimension(500, 80));
            btn_row[i].setAlignmentX(JComponent.CENTER_ALIGNMENT);
            btn_row[i].setLayout(new GridLayout(1, 5));
            btn_row[i].setOpaque(true);
            btn_row[i].setBackground(Color.getHSBColor(0.5f, 0.5f, 0.5f));
        }

        for (int i = 0; i < 10; i++)
        {
            digits[i] = new JButton("" + i);
            digits[i].setFont(font);
            digits[i].setPreferredSize(new Dimension(100, 80));
            digits[i].setAlignmentX(JComponent.CENTER_ALIGNMENT);
            digits[i].setOpaque(true);
            digits[i].setBackground(Color.getHSBColor(0.6f, 0.5f, 0.5f));
            digits[i].setBorder(BorderFactory.createLineBorder(Color.getHSBColor(0,0,0), 1));
        }
        digits[0].addActionListener(this::buttonDigit0ActionPerformed);
        digits[1].addActionListener(this::buttonDigit1ActionPerformed);
        digits[2].addActionListener(this::buttonDigit2ActionPerformed);
        digits[3].addActionListener(this::buttonDigit3ActionPerformed);
        digits[4].addActionListener(this::buttonDigit4ActionPerformed);
        digits[5].addActionListener(this::buttonDigit5ActionPerformed);
        digits[6].addActionListener(this::buttonDigit6ActionPerformed);
        digits[7].addActionListener(this::buttonDigit7ActionPerformed);
        digits[8].addActionListener(this::buttonDigit8ActionPerformed);
        digits[9].addActionListener(this::buttonDigit9ActionPerformed);
        btn_row[0].add(digits[7]);
        btn_row[0].add(digits[8]);
        btn_row[0].add(digits[9]);
        btn_row[1].add(digits[4]);
        btn_row[1].add(digits[5]);
        btn_row[1].add(digits[6]);
        btn_row[2].add(digits[1]);
        btn_row[2].add(digits[2]);
        btn_row[2].add(digits[3]);
        btn_row[3].add(digits[0]);
        
        dot = new JButton(".");
        dot.setFont(font);
        dot.setPreferredSize(new Dimension(100, 100));
        dot.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        dot.setOpaque(true);
        dot.setBackground(Color.getHSBColor(0.6f, 0.5f, 0.5f));
        dot.setBorder(BorderFactory.createLineBorder(Color.getHSBColor(0,0,0), 1));
        dot.addActionListener(this::buttonDotActionPerformed);
        btn_row[3].add(dot);

        backspace = new JButton("<=");
        backspace.setFont(font);
        backspace.setPreferredSize(new Dimension(100, 100));
        backspace.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        backspace.setOpaque(true);
        backspace.setBackground(Color.getHSBColor(0.6f, 0.5f, 0.5f));
        backspace.setBorder(BorderFactory.createLineBorder(Color.getHSBColor(0,0,0), 1));
        backspace.addActionListener(this::buttonBackspaceActionPerformed);
        btn_row[3].add(backspace);

        add = new JButton("+");
        add.setFont(font);
        add.setPreferredSize(new Dimension(100, 100));
        add.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        add.setOpaque(true);
        add.setBackground(Color.getHSBColor(0.6f, 0.5f, 0.5f));
        add.setBorder(BorderFactory.createLineBorder(Color.getHSBColor(0,0,0), 1));
        add.addActionListener(this::buttonAddActionPerformed);
        btn_row[4].add(add);

        sub = new JButton("-");
        sub.setFont(font);
        sub.setPreferredSize(new Dimension(100, 100));
        sub.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        sub.setOpaque(true);
        sub.setBackground(Color.getHSBColor(0.6f, 0.5f, 0.5f));
        sub.setBorder(BorderFactory.createLineBorder(Color.getHSBColor(0,0,0), 1));
        sub.addActionListener(this::buttonSubActionPerformed);
        btn_row[4].add(sub);

        mul = new JButton("*");
        mul.setFont(font);
        mul.setPreferredSize(new Dimension(100, 100));
        mul.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        mul.setOpaque(true);
        mul.setBackground(Color.getHSBColor(0.6f, 0.5f, 0.5f));
        mul.setBorder(BorderFactory.createLineBorder(Color.getHSBColor(0,0,0), 1));
        mul.addActionListener(this::buttonMulActionPerformed);
        btn_row[4].add(mul);

        div = new JButton("/");
        div.setFont(font);
        div.setPreferredSize(new Dimension(100, 100));
        div.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        div.setOpaque(true);
        div.setBackground(Color.getHSBColor(0.6f, 0.5f, 0.5f));
        div.setBorder(BorderFactory.createLineBorder(Color.getHSBColor(0,0,0), 1));
        div.addActionListener(this::buttonDivActionPerformed);
        btn_row[4].add(div);

        changeEdit = new JButton("A/B");
        changeEdit.setFont(font);
        changeEdit.setPreferredSize(new Dimension(100, 100));
        changeEdit.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        changeEdit.setOpaque(true);
        changeEdit.setBackground(Color.getHSBColor(0.6f, 0.5f, 0.5f));
        changeEdit.setBorder(BorderFactory.createLineBorder(Color.getHSBColor(0,0,0), 1));
        changeEdit.addActionListener(this::buttonChangeEditActionPerformed);
        btn_row[4].add(changeEdit);
        
        for (int i = 0; i < 5; i++) btns.add(btn_row[i]);
        panel.add(btns);

        f.getContentPane().add(panel);
        f.pack();
        f.setVisible(true);
    }

    private void buttonAddActionPerformed(java.awt.event.ActionEvent e) {
        try {
            a = Double.parseDouble(inputA);
            b = Double.parseDouble(inputB);
            res = a + b;
            outputResString = Double.toString(res);
            outputRes.setText("Результат: " + outputResString);
            outputRes.revalidate();
        }
        catch (Exception exc) {
            JOptionPane.showMessageDialog( null, "Ошибка в записи чисел","alert" , JOptionPane.ERROR_MESSAGE);
        }
    }

    private void buttonSubActionPerformed(java.awt.event.ActionEvent e) {
        try {
            a = Double.parseDouble(inputA);
            b = Double.parseDouble(inputB);
            res = a - b;
            outputResString = Double.toString(res);
            outputRes.setText("Результат: " + outputResString);
            outputRes.revalidate();
        }
        catch (Exception exc) {
            JOptionPane.showMessageDialog( null, "Ошибка в записи чисел","alert" , JOptionPane.ERROR_MESSAGE);
        }
    }

    private void buttonMulActionPerformed(java.awt.event.ActionEvent e) {
        try {
            a = Double.parseDouble(inputA);
            b = Double.parseDouble(inputB);
            res = a * b;
            outputResString = Double.toString(res);
            outputRes.setText("Результат: " + outputResString);
            outputRes.revalidate();
        }
        catch (Exception exc) {
            JOptionPane.showMessageDialog( null, "Ошибка в записи чисел","alert" , JOptionPane.ERROR_MESSAGE);
        }
    }

    private void buttonDivActionPerformed(java.awt.event.ActionEvent e) {
        try {
            a = Double.parseDouble(inputA);
            b = Double.parseDouble(inputB);
            res = a / b;
            outputResString = Double.toString(res);
            outputRes.setText("Результат: " + outputResString);
            outputRes.revalidate();
        }
        catch (Exception exc) {
            JOptionPane.showMessageDialog( null, "Ошибка в записи чисел","alert" , JOptionPane.ERROR_MESSAGE);
        }
    }

    private void buttonDigitActionPerformed(int btn)
    {
        if(!this.currentEdit)
        {
            if (inputA.equals("0"))
                inputA = Integer.toString(btn);
            else
                inputA += Integer.toString(btn);
            outputA.setText("Число А: " + inputA);
            outputA.revalidate();
        }
        else
        {
            if (inputB.equals("0"))
                inputB = Integer.toString(btn);
            else
                inputB += Integer.toString(btn);
            outputB.setText("Число B: " + inputB);
            outputB.revalidate();
        }
    }

    private void buttonDotActionPerformed(java.awt.event.ActionEvent e)
    {
        if(!this.currentEdit)
        {
            if (!inputA.contains(".")) inputA += ".";
            outputA.setText("Число А: " + inputA);
            outputA.revalidate();
        }
        else
        {
            if (!inputB.contains(".")) inputB += ".";
            outputB.setText("Число B: " + inputB);
            outputB.revalidate();
        }
    }

    private void buttonChangeEditActionPerformed(java.awt.event.ActionEvent e) {
        currentEdit = !currentEdit;
        if (currentEdit)
        {
            outputA.setBackground(Color.getHSBColor(0.33f, 0.5f, 1));
            outputB.setBackground(Color.getHSBColor(0.2f, 0.5f, 1));
        }
        else {
            outputB.setBackground(Color.getHSBColor(0.33f, 0.5f, 1));
            outputA.setBackground(Color.getHSBColor(0.2f, 0.5f, 1));
        }
        outputA.revalidate();
        outputB.revalidate();
    }

    private void buttonDigit0ActionPerformed(java.awt.event.ActionEvent e) {
        buttonDigitActionPerformed(0);
    }
    private void buttonDigit1ActionPerformed(java.awt.event.ActionEvent e) {
        buttonDigitActionPerformed(1);
    }
    private void buttonDigit2ActionPerformed(java.awt.event.ActionEvent e) {
        buttonDigitActionPerformed(2);
    }
    private void buttonDigit3ActionPerformed(java.awt.event.ActionEvent e) {
        buttonDigitActionPerformed(3);
    }
    private void buttonDigit4ActionPerformed(java.awt.event.ActionEvent e) {
        buttonDigitActionPerformed(4);
    }
    private void buttonDigit5ActionPerformed(java.awt.event.ActionEvent e) {
        buttonDigitActionPerformed(5);
    }
    private void buttonDigit6ActionPerformed(java.awt.event.ActionEvent e) {
        buttonDigitActionPerformed(6);
    }
    private void buttonDigit7ActionPerformed(java.awt.event.ActionEvent e) {
        buttonDigitActionPerformed(7);
    }
    private void buttonDigit8ActionPerformed(java.awt.event.ActionEvent e) {
        buttonDigitActionPerformed(8);
    }
    private void buttonDigit9ActionPerformed(java.awt.event.ActionEvent e) {
        buttonDigitActionPerformed(9);
    }
    private void buttonBackspaceActionPerformed(java.awt.event.ActionEvent e) {
        if (!currentEdit)
        {
            if (!inputA.equals("0"))
            {
                inputA = inputA.substring(0, inputA.length() - 1);
                if (inputA.length() == 0)
                    inputA = "0";
                outputA.setText("Число А: " + inputA);
                outputA.revalidate();
            }
        }
        else
        {
            if (!inputB.equals("0"))
            {
                inputB = inputB.substring(0, inputB.length() - 1);
                if (inputB.length() == 0)
                    inputB = "0";
                outputB.setText("Число B: " + inputB);
                outputB.revalidate();
            }
        }
    }
}
