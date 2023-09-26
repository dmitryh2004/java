package exercise1;

public class Circle extends Shape {
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
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
    public String toString() {
        String res = "Окружность с радиусом " + radius;
        if (this.filled)
        {
            res += ", цвет: " + this.color;
        }
        return res;
    }
}
