package task1;

public class Rectangle extends Shape {
    double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public String getType() {
        return "Прямоугольник";
    }

    @Override
    public String toString() {
        return "Прямоугольник " + a + "x" + b;
    }
}
