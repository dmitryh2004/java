package task2;

public class Ball {
    double x = 0.0;
    double y = 0.0;

    public Ball (double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Ball()
    {
        this.x = this.y = 0;
    }

    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
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

    public void move(double dx, double dy)
    {
        this.setXY(this.getX()+dx, this.getY()+dy);
    }

    public String toString()
    {
        return ("Position: (" + this.getX() + ", " + this.getY() + ")");
    }
}
