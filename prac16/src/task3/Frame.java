package task3;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {
    JTextField[] field = new JTextField[3];
    JLabel[] labels = new JLabel[3];
    JButton check = new JButton("Войти");

    JPanel panel1 = new JPanel(), panel2 = new JPanel();

    User[] users = {
            new User("service1", "user1", "123"),
            new User("service1", "user2", "1234"),
            new User("service2", "user3", "1235")
    };

    Frame() {
        super("Авторизация");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        labels[0] = new JLabel("Сервис: ");
        labels[1] = new JLabel("Логин: ");
        labels[2] = new JLabel("Пароль: ");
        field[0] = new JTextField();
        field[1] = new JTextField();
        field[2] = new JTextField();

        panel1.setLayout(new GridLayout(3, 2));
        panel1.add(labels[0]);
        panel1.add(field[0]);
        panel1.add(labels[1]);
        panel1.add(field[1]);
        panel1.add(labels[2]);
        panel1.add(field[2]);

        add(panel1);

        check.addActionListener(this::Enter);
        panel2.add(check);

        panel2.setBorder(new EmptyBorder(20, 20, 20, 20));
        add(panel2);

        setVisible(true);
    }

    private void Enter (ActionEvent e) {
        boolean enter = false;
        for (User u:users)
        {
            if (u.check(field[0].getText(), field[1].getText(), field[2].getText()))
            {
                enter = true;
                break;
            }
        }

        if (enter)
        {
            JOptionPane.showMessageDialog(null, "Авторизация успешна", "Успех", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Неверные данные", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }
}
