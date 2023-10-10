package shape;

import java.awt.*;

public class Square extends Rectangle {

    public Square() {

    }

    public Square(double side) {
        this.width = this.length = side;
    }

    public Square(double side, Color color, boolean filled) {
        this.width = this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        this.width = side;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        String res = "Квадрат со стороной " + this.width;
        if (this.filled)
        {
            res += ", цвет: " + this.color;
        }
        return res;
    }
}
