package task1;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Frame extends JFrame {
    int num = 5; //-1 for random
    int attempts = 3; //попытки
    JLabel l = new JLabel("Введите число от 1 до 20");
    JLabel al = new JLabel("Осталось попыток: 3");
    JTextField jtf = new JTextField();
    JButton check = new JButton("Check");
    JPanel panel1 = new JPanel(), panel2 = new JPanel();
    Frame()
    {
        super("Guessing...");

        if (num == -1)
        {
            Random rand = new Random();
            num = rand.nextInt(20) + 1;
        }

        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GridLayout gl = new GridLayout(2, 1);
        GridLayout gl2 = new GridLayout(1,2);
        setLayout(gl);

        check.addActionListener(this::checkNumber);
        panel1.setBorder(new EmptyBorder(20,20,20,20));
        panel1.add(l);
        panel1.add(jtf);
        panel1.setLayout(gl2);
        add(panel1);
        panel2.setBorder(new EmptyBorder(20,20,20,20));
        panel2.setLayout(gl2);
        panel2.add(al);
        panel2.add(check);
        add(panel2);
        setVisible(true);
    }

    private void checkNumber (ActionEvent e) {
        try {
            int input = Integer.parseInt(jtf.getText());
            if (input < 1 || input > 20)
            {
                JOptionPane.showMessageDialog(null, "Число должно лежать в диапазоне [1-20]", "Вы перепутали диапазон :)", JOptionPane.ERROR_MESSAGE);
            }
            else if (input < num)
            {
                JOptionPane.showMessageDialog(null, "Введенное число меньше загаданного", "Не угадал", JOptionPane.WARNING_MESSAGE);
                attempts--;
            }
            else if (input > num)
            {
                JOptionPane.showMessageDialog(null, "Введенное число больше загаданного", "Не угадал", JOptionPane.WARNING_MESSAGE);
                attempts--;
            }
            else {
                JOptionPane.showMessageDialog(null, "Вы угадали число - " + num, "Вы выиграли", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
            if (attempts == 0)
            {
                JOptionPane.showMessageDialog(null, "Попытки закончились... :(\nЗагаданное число - " + num, "Вы проиграли", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        }
        catch (Exception exc) {
            JOptionPane.showMessageDialog(null, "Wrong input", "Я не буду обрабатывать этот ввод!", JOptionPane.ERROR_MESSAGE);
        }
        al.setText("Осталось попыток: " + attempts);
        al.revalidate();
    }
}
