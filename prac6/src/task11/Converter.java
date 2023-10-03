package task11;

public class Converter implements Convertable {
    @Override
    public float toCel(float Far) {
        return (Far - 32) * 5 / 9;
    }

    @Override
    public float toFar(float Cel) {
        return (Cel * 9 / 5) + 32;
    }
}
