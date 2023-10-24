package task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {
    JTextArea jta = new JTextArea(8, 30);
    JButton[] colors = new JButton[3];
    JButton[] fonts = new JButton[3];
    JPanel westPanel = new JPanel(), eastPanel = new JPanel();
    Font[] font = new Font[3];

    String[] colorNames = {
            "черный",
            "красный",
            "синий"
    };

    String[] fontNames = {
            "Times New Roman",
            "MS Sans Serif",
            "Courier New"
    };

    Frame() {
        super("Редактор текста");
        setSize(800, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        westPanel.setLayout(new GridLayout(3, 1));
        eastPanel.setLayout(new GridLayout(3, 1));

        for (int i = 0; i < 3; i++)
        {
            colors[i] = new JButton(colorNames[i]);
            fonts[i] = new JButton(fontNames[i]);
            font[i] = new Font(fontNames[i], Font.PLAIN, 12);
            colors[i].addActionListener(this::setColor);
            fonts[i].addActionListener(this::setFont);
            westPanel.add(colors[i]);
            eastPanel.add(fonts[i]);
        }

        jta.setForeground(new Color(0, 0, 0));
        jta.setFont(font[0]);

        getContentPane().add("Center", jta);
        getContentPane().add("West", westPanel);
        getContentPane().add("East", eastPanel);
        setVisible(true);
    }

    private void setColor(ActionEvent e) {
        if (((JButton) e.getSource()).getText().equals(colorNames[0])) {
            jta.setForeground(new Color(0, 0, 0));
        }
        else if (((JButton) e.getSource()).getText().equals(colorNames[1])) {
            jta.setForeground(new Color(255, 0, 0));
        }
        else if (((JButton) e.getSource()).getText().equals(colorNames[2])) {
            jta.setForeground(new Color(0, 0, 255));
        }
    }

    private void setFont(ActionEvent e) {
        if (((JButton) e.getSource()).getText().equals(fontNames[0])) {
            jta.setFont(font[0]);
        }
        else if (((JButton) e.getSource()).getText().equals(fontNames[1])) {
            jta.setFont(font[1]);
        }
        else if (((JButton) e.getSource()).getText().equals(fontNames[2])) {
            jta.setFont(font[2]);
        }
    }
}
