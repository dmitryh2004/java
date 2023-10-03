package task1;

public class Circle extends Shape {
    double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getType() {
        return "Окружность";
    }

    @Override
    public String toString() {
        return "Окружность с радиусом " + radius;
    }
}
