package task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    Controller c;
    JPanel[][] panel = new JPanel[3][2];
    JLabel[][] label = new JLabel[3][2];

    JButton[][] btn = new JButton[3][2];

    public MainFrame() {
        super("MVC with GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new GridLayout(3, 1, 5, 5));

        for (int i = 0; i < 3; i++)
        {
            panel[i][0] = new JPanel();
            panel[i][0].setLayout(new FlowLayout(FlowLayout.CENTER));
            panel[i][1] = new JPanel();
            panel[i][1].setLayout(new GridLayout(2, 1, 5, 5));

            label[i][0] = new JLabel("Значение " + (i+1), SwingConstants.CENTER);
            label[i][1] = new JLabel("0", SwingConstants.CENTER);

            btn[i][0] = new JButton("<");
            btn[i][1] = new JButton(">");

            panel[i][1].add(label[i][0]);
            panel[i][1].add(label[i][1]);

            panel[i][0].add(btn[i][0]);
            panel[i][0].add(panel[i][1]);
            panel[i][0].add(btn[i][1]);
        }

        btn[0][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.decModelValue1();
                c.updateView();
            }
        });
        btn[0][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.incModelValue1();
                c.updateView();
            }
        });
        btn[1][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.decModelValue2();
                c.updateView();
            }
        });
        btn[1][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.incModelValue2();
                c.updateView();
            }
        });
        btn[2][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.decModelValue3();
                c.updateView();
            }
        });
        btn[2][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.incModelValue3();
                c.updateView();
            }
        });

        add(panel[0][0]);
        add(panel[1][0]);
        add(panel[2][0]);
        setVisible(true);
    }

    public void setController(Controller c)
    {
        this.c = c;
    }

    public void updateValues (int v1, int v2, int v3) {
        label[0][1].setText(Integer.toString(v1));
        label[0][1].revalidate();
        label[1][1].setText(Integer.toString(v2));
        label[1][1].revalidate();
        label[2][1].setText(Integer.toString(v3));
        label[2][1].revalidate();
    }
}
