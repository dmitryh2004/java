package task4;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon(args[0]); //args[0] - полный путь к файлу
        JLabel jLabel = new JLabel(icon);
        JPanel jPanel = new JPanel();
        jPanel.add(jLabel);
        JFrame f = new JFrame("Animation");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setMinimumSize(new Dimension(400, 400));
        f.add(jPanel);
        f.pack();
        f.setVisible(true);
        /*JFrame f = new JFrame("Animation");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setMinimumSize(new Dimension(400, 400));
        int ind = 0;
        while (true)
        {
            String path = args[0] + "2c29417c7eeb468ce1670738cf3841d1Qewf31qiCQyxGRwD-" + ind + ".png"; //args[0] - путь к папке с png
            ImageIcon icon = new ImageIcon(path);
            JLabel jLabel = new JLabel(icon);
            f.add(jLabel);
            f.setVisible(true);
            try {
                Thread.sleep((long)(1000.0f / 60));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            f.remove(jLabel);
            ind = (ind+1)%144;
        }*/
    }
}
