package task1_2;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Tester test = new Tester();
        Random rand = new Random();
        for (int i = 0; i < 15; i++)
        {
            double x, y, r;
            x = rand.nextDouble(-10, 10);
            y = rand.nextDouble(-10, 10);
            r = rand.nextDouble(0, 10);
            test.addCircle(new Circle(x,y,r, "circle" + (i+1)));
        }
        System.out.println(test);
        System.out.println("Окружность с самым большим радиусом: " + test.getCircleWithMaxRadius());
        System.out.println("Окружность с самым маленьким радиусом: " + test.getCircleWithMinRadius());
    }
}
