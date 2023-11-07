package ReversePolishNotationCalculator.frontend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class MainFrame extends JFrame {
    RPNCalcController c;
    JPanel[] btnPanel = new JPanel[5];
    JButton[] btn = new JButton[19];

    Font font = new Font("Times New Roman", Font.PLAIN, 48);

    JLabel text = new JLabel();

    public MainFrame() {
        super("RPN calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new GridLayout(6, 1, 5, 5));

        text.setText("0");
        text.setFont(font);
        add(text);
        for (int i = 0; i < 4; i++)
        {
            btnPanel[i] = new JPanel();
            btnPanel[i].setLayout(new GridLayout(1, 4, 5, 5));
            for (int j = 0; j < 4; j++)
            {
                btn[4*i+j] = new JButton();
                btn[4*i+j].setFont(font);
                btnPanel[i].add(btn[4*i+j]);
            }
            add(btnPanel[i]);
        }
        btn[0].setText("7");
        btn[1].setText("8");
        btn[2].setText("9");
        btn[3].setText("/");
        btn[4].setText("4");
        btn[5].setText("5");
        btn[6].setText("6");
        btn[7].setText("*");
        btn[8].setText("1");
        btn[9].setText("2");
        btn[10].setText("3");
        btn[11].setText("-");
        btn[12].setText("0");
        btn[13].setText(".");
        btn[14].setText("+");
        btn[15].setText("=");
        btnPanel[4] = new JPanel();
        btnPanel[4].setLayout(new GridLayout(1,3,5,5));
        btn[16] = new JButton("<=");
        btn[16].setFont(font);
        btnPanel[4].add(btn[16]);
        btn[17] = new JButton("Clear");
        btn[17].setFont(font);
        btnPanel[4].add(btn[17]);
        btn[18] = new JButton("Space");
        btn[18].setFont(font);
        btnPanel[4].add(btn[18]);
        add(btnPanel[4]);

        for (int i = 0; i < 15; i++)
        {
            btn[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    addSymbol(((JButton) e.getSource()).getText().charAt(0));
                }
            });
        }
        btn[15].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input();
            }
        });
        btn[16].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeSymbol();
            }
        });
        btn[17].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("0");
                text.revalidate();
            }
        });
        btn[18].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addSymbol(' ');
            }
        });

        setVisible(true);
    }

    private void addSymbol(char ch) {
        if ((Objects.equals(this.text.getText(), "0")) && (ch != '.') && (ch != ' '))
            this.text.setText(String.valueOf(ch));
        else
            this.text.setText(this.text.getText() + ch);
        this.text.revalidate();
    }

    private void removeSymbol() {
        if (this.text.getText().length() == 1)
            this.text.setText("0");
        else
            this.text.setText(this.text.getText().substring(0, this.text.getText().length() - 1));
        this.text.revalidate();
    }

    private void input() {
        String input = text.getText();
        for (int i = 0; i < input.length(); i++)
        {
            if ((input.charAt(i) == '+') || (input.charAt(i) == '-') ||
                    (input.charAt(i) == '*') || (input.charAt(i) == '/'))
            {
                if (input.charAt(i-1) != ' ')
                {
                    input = input.replaceFirst("\\" + input.charAt(i), " " + input.charAt(i));
                }
                if (i < input.length()-1)
                {
                    if (input.charAt(i+1) != ' ')
                    {
                        input = input.replaceFirst(String.valueOf(input.charAt(i)), input.charAt(i) + " ");
                    }
                }
            }
        }
        c.calculateExpression(input);
    }

    public void updateValue(String value) {
        this.text.setText(value);
        this.text.revalidate();
    }

    public void setController(RPNCalcController c) {
        this.c = c;
    }
}
