package task3;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Frame extends JFrame {
    JButton btn1 = new JButton("Button 1"), btn2 = new JButton("Button 2");

    JMenu file = new JMenu("File"), edit = new JMenu("Edit"), help = new JMenu("Help");

    JMenuBar menuBar = new JMenuBar();

    JMenuItem save = new JMenuItem("Save"), quit = new JMenuItem("Quit"),
            copy = new JMenuItem("Copy"), cut = new JMenuItem("Cut"), paste = new JMenuItem("Paste");

    JPanel panel = new JPanel();

    JTextArea jta = new JTextArea("In this area you can write text",8,30);

    Frame() {
        super ("Menu");
        setSize(250, 250);
        file.add(save);
        file.add(quit);
        edit.add(copy);
        edit.add(cut);
        edit.add(paste);
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);
        setJMenuBar(menuBar);

        setLayout(new GridLayout(2,1));
        panel.setPreferredSize(new Dimension(200, 100));
        GridLayout gl = new GridLayout(0,2);
        gl.setHgap(20);
        panel.setLayout(gl);
        panel.add(btn1);
        panel.add(btn2);
        panel.setBorder(new EmptyBorder(10, 20, 10, 20));
        add(panel);
        add(jta);
        setVisible(true);
    }
}
