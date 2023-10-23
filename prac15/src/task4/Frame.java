package task4;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

    String exp = "";
    JButton[] btn = new JButton[16];
    JButton btnClear = new JButton("Clear");
    JTextArea jta = new JTextArea(8,30);
    JPanel[] btnRowPanel = new JPanel[4];
    Frame()
    {
        super("Calculator v2");
        setSize(500, 500);
        setLayout(new GridLayout(6,1));
        btn[0] = new JButton("7");
        btn[1] = new JButton("8");
        btn[2] = new JButton("9");
        btn[3] = new JButton("/");
        btn[4] = new JButton("4");
        btn[5] = new JButton("5");
        btn[6] = new JButton("6");
        btn[7] = new JButton("*");
        btn[8] = new JButton("1");
        btn[9] = new JButton("2");
        btn[10] = new JButton("3");
        btn[11] = new JButton("-");
        btn[12] = new JButton("0");
        btn[13] = new JButton(".");
        btn[14] = new JButton("=");
        btn[15] = new JButton("+");

        for (int i = 0; i < 4; i++)
        {
            btnRowPanel[i] = new JPanel();
            btnRowPanel[i].setPreferredSize(new Dimension(400, 100));
            btnRowPanel[i].setBorder(new EmptyBorder(20, 20, 20, 20));
            GridLayout gl = new GridLayout(1,4);
            gl.setHgap(20);
            btnRowPanel[i].setLayout(gl);
            for (int j = 0; j < 4; j++)
            {
                btn[4*i+j].addActionListener(this::actionBtnActionPerformed);
                btnRowPanel[i].add(btn[4 * i + j]);
            }
        }

        btnClear.addActionListener(this::btnClearActionPerformed);

        jta.setEditable(false);
        add(jta);
        add(btnRowPanel[0]);
        add(btnRowPanel[1]);
        add(btnRowPanel[2]);
        add(btnRowPanel[3]);
        add(btnClear);
        setVisible(true);
    }

    private void btnClearActionPerformed(ActionEvent e) {
        jta.setText("");
        jta.revalidate();
    }

    private void changeExpression(int signPos, char operation) {
        String temp = this.exp;
        String first = "", second = "";
        int firstIndex = 0, secondIndex = temp.length();
        for (int i = signPos - 1; i >= 0; i--)
        {
            char c = temp.charAt(i);

            if (!((c == '+') || (c == '-') || (c == '*') || (c == '/')))
            {
                first = c + first;
            }
            else {
                firstIndex = i;
                break;
            }
        }
        for (int i = signPos + 1; i < temp.length(); i++)
        {
            char c = temp.charAt(i);

            if (!((c == '+') || (c == '-') || (c == '*') || (c == '/')))
            {
                second += c;
            }
            else {
                secondIndex = i;
                break;
            }
        }
        if (first.length() - first.replace(".", "").length() > 1)
        {
            jta.setText("Возникла ошибка при вычислении - исходное выражение записано неверно.");
            jta.revalidate();
            return;
        }
        if (second.length() - second.replace(".", "").length() > 1)
        {
            jta.setText("Возникла ошибка при вычислении - исходное выражение записано неверно.");
            jta.revalidate();
            return;
        }
        double res = 0;
        try {
            switch (operation)
            {
                case '+':
                    res = Double.parseDouble(first)+Double.parseDouble(second);
                    break;
                case '-':
                    res = Double.parseDouble(first)-Double.parseDouble(second);
                    break;
                case '*':
                    res = Double.parseDouble(first)*Double.parseDouble(second);
                    break;
                case '/':
                    res = Double.parseDouble(first)/Double.parseDouble(second);
                    break;
            }
            String fp, sp = temp.substring(secondIndex);
            fp = (firstIndex == 0) ? temp.substring(0, firstIndex) : temp.substring(0, firstIndex+1);
            this.exp = fp + res + sp;
        }
        catch (Exception e)
        {
            jta.setText("Возникла ошибка при вычислении - исходное выражение записано неверно.");
            jta.revalidate();
        }
    }
    private void checkExpression() {
        this.exp = jta.getText();
        int i;
        for (i = 0; i < this.exp.length(); i++)
        {
            boolean mul = false;
            for (int j = 0; j < this.exp.length(); j++)
            {
                if (exp.charAt(j) == '*' || exp.charAt(j) == '/')
                {
                    mul = true;
                    break;
                }
            }
            if (exp.charAt(i) == '*')
            {
                changeExpression(i, '*');
                i = 0;
            }
            else if (exp.charAt(i) == '/')
            {
                changeExpression(i, '/');
                i = 0;
            }
            if (!mul) {
                if (exp.charAt(i) == '+') {
                    changeExpression(i, '+');
                    i = 0;
                } else if (exp.charAt(i) == '-') {
                    changeExpression(i, '-');
                    i = 0;
                }
            }
            if (jta.getText().equals("Возникла ошибка при вычислении - исходное выражение записано неверно."))
            {
                break;
            }
        }
        if (!jta.getText().equals("Возникла ошибка при вычислении - исходное выражение записано неверно."))
        {
            jta.setText(exp);
        }
    }

    private void actionBtnActionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        switch (source.getText())
        {
            case "=":
                checkExpression();
                break;
            default:
                jta.append(source.getText());
        }
    }
}
