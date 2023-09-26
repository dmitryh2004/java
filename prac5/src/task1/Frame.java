package task1;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Frame {
    JFrame frame;
    JPanel panel;
    JButton buttonMilan, buttonMadrid;
    JLabel result;
    JLabel last;
    JLabel winner;
    int[] score = {0, 0};
    public void initFrame()
    {
        frame = new JFrame("test gui");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        panel = new JPanel();
        panel.setBackground(Color.getHSBColor(0, 0, 0.5f));
        panel.setPreferredSize(new Dimension(200,300));

        buttonMilan = new JButton("AC Milan");
        buttonMilan.addActionListener(this::buttonMilanActionPerformed);
        panel.add(buttonMilan);
        buttonMadrid = new JButton("Real Madrid");
        buttonMadrid.addActionListener(this::buttonMadridActionPerformed);
        panel.add(buttonMadrid);

        result = new JLabel("Result: 0 X 0", JLabel.CENTER);
        panel.add(result);
        last = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        panel.add(last);
        winner = new JLabel("Winner: DRAW", JLabel.CENTER);
        panel.add(winner);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private void buttonMilanActionPerformed(java.awt.event.ActionEvent e)
    {
        score[0]++;
        result.setText("Result: " + score[0] + " X " + score[1]);
        result.revalidate();
        last.setText("Last Scorer: AC Milan");
        last.revalidate();
        checkForWin();
    }

    private void buttonMadridActionPerformed(java.awt.event.ActionEvent e)
    {
        score[1]++;
        result.setText("Result: " + score[0] + " X " + score[1]);
        result.revalidate();
        last.setText("Last Scorer: Real Madrid");
        last.revalidate();
        checkForWin();
    }

    private void checkForWin() {
        String team = "DRAW";
        if (score[0] > score[1])
            team = "AC Milan";
        else if (score[0] < score[1])
            team = "Real Madrid";
        winner.setText("Winner: " + team);
        winner.revalidate();
    }
}
