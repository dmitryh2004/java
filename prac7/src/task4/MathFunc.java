package task4;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double base, double index) {
        return Math.pow(base, index);
    }

    @Override
    public double abs_complex(double re, double im) {
        return Math.sqrt(re * re + im * im);
    }
}
