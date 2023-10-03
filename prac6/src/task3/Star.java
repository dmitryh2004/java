package task3;

public class Star extends NameableObject {
    float mass;
    float radius;
    int temperature;

    public Star(String name, float mass, float radius, int temperature) {
        super(name);
        this.mass = mass;
        this.radius = radius;
        this.temperature = temperature;
    }

    public float getG()
    {
        return (float)((6.67 * Math.pow(10,(-11))) * this.mass / (Math.pow(this.radius, 2)));
    }

    public float getMass() {
        return mass;
    }

    public float getRadius() {
        return radius;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Star{" +
                "mass=" + mass +
                ", radius=" + radius +
                ", temperature=" + temperature +
                '}';
    }
}
