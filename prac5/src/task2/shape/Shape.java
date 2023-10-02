package task2.shape;
import java.awt.Color;
public abstract class Shape {
    protected Color color;
    protected boolean filled;

    Shape()
    {

    }

    Shape(Color color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
