package task6;

public class Circle {
    Point center;
    float radius;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Circle(Point center, float radius) {
        this.center = center;
        this.radius = radius;
    }

    public boolean equalsTo(Circle anotherCircle)
    {
        return this.radius == anotherCircle.radius;
    }

    public float getSquare()
    {
        return (float)(Math.PI * Math.pow(this.radius, 2));
    }

    public float getLength()
    {
        return (float)(2 * Math.PI * this.radius);
    }

    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
