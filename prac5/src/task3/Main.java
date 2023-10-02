package task3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        ImageIcon img= new ImageIcon(args[0]);
        frame.add(new JLabel(img));

        System.out.println(args[0]);

        frame.setVisible(true);
    }
}
