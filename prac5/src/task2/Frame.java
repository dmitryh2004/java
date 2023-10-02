package task2;

import java.util.Random;
import javax.swing.*;
import java.awt.*;
import task2.shape.*;
import task2.shape.Rectangle;

public class Frame extends JFrame {
    public void paint(Graphics g)
    {
        Random rand = new Random();
        this.setSize(800, 600);
        this.setBackground(Color.white);
        for (int i = 0; i < 20; i++)
        {
            int color_r = rand.nextInt(255);
            int color_g = rand.nextInt(255);
            int color_b = rand.nextInt(255);
            int type = rand.nextInt(3);
            int data1 = 0, data2 = 0;
            int posx = rand.nextInt(800), posy = rand.nextInt(600);
            task2.shape.Shape shape = null;
            switch (type)
            {
                case 0:
                    data1 = rand.nextInt(100);
                    shape = new Circle(data1, new Color(color_r, color_g, color_b), true);
                    g.setColor(new Color(color_r, color_g, color_b));
                    g.fillOval(posx, posy, data1, data1);
                    break;
                case 1:
                    data1 = rand.nextInt(100);
                    data2 = rand.nextInt(100);
                    shape = new Rectangle(data1, data2, new Color(color_r, color_g, color_b), true);
                    g.setColor(new Color(color_r, color_g, color_b));
                    g.fillRect(posx, posy, data1, data2);
                    break;
                case 2:
                    data1 = rand.nextInt(100);
                    shape = new Square(data1, new Color(color_r, color_g, color_b), true);
                    g.setColor(new Color(color_r, color_g, color_b));
                    g.fillRect(posx, posy, data1, data1);
                    break;
            }
        }
    }
}
