package task4;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon(args[0]);
        JLabel jLabel = new JLabel(icon);
        JPanel jPanel = new JPanel();
        jPanel.add(jLabel);
        JFrame f = new JFrame("Animation");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setMinimumSize(new Dimension(400, 400));
        f.add(jPanel);
        f.pack();
        f.setVisible(true);
    }
}
