package task1_2;

public class Circle {
    String name = "";
    Point center = new Point();
    double radius = 0.0;

    public Circle(double x, double y, double r, String name)
    {
        this.center = new Point(x, y);
        this.radius = r;
        this.name = name;
    }

    public void setCenter(double x, double y)
    {
        this.center.setXY(x, y);
    }

    public void setRadius(double r)
    {
        this.radius = r;
    }

    public Point getCenter()
    {
        return this.center;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public String toString()
    {
        return "Circle " + this.name + " - center: " + this.getCenter().toString() +
                ", radius: " + this.getRadius();
    }
}
