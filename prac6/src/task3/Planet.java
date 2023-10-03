package task3;

public class Planet extends NameableObject {
    float mass;
    float radius;

    public Planet(String name, float mass, float radius) {
        super(name);
        this.mass = mass;
        this.radius = radius;
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

    @Override
    public String toString() {
        return "Planet{" +
                "mass=" + mass +
                ", radius=" + radius +
                '}';
    }
}
