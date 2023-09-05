package task3;

public class Point {
    double x;
    double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Point()
    {
        this.x = this.y = 0;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public void setXY(double x, double y)
    {
        this.setX(x);
        this.setY(y);
    }

    public double getX()
    { return this.x; }

    public double getY()
    { return this.y; }

    public String toString()
    {
        return "(" + this.getX() + ", " + this.getY() + ")";
    }
}
