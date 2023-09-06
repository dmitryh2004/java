package task6;

public class Tester {
    public static void main(String[] args) {
        Circle circle1 = new Circle(new Point(3,4), 5);
        Circle circle2 = new Circle(new Point(-3, -4), 6);
        Circle circle3 = new Circle(new Point(0, -140), 5);
        System.out.println("Окружности: " + circle1 + ", " + circle2 + ", " + circle3);
        System.out.println("Площадь первого круга:" + circle1.getSquare());
        System.out.println("Длина второй окружности:" + circle2.getLength());
        System.out.println("Окружности 1 и 3 " + ((circle1.equalsTo(circle3))? "" :"не ") + "равны");
        System.out.println("Окружности 1 и 2 " + ((circle1.equalsTo(circle2))? "" :"не ") + "равны");
        System.out.println("Окружности 2 и 3 " + ((circle2.equalsTo(circle3))? "" :"не ") + "равны");
    }
}
