package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MathCalculable mc = new MathFunc();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите радиус шара: ");
        double rad = 0;
        if (sc.hasNextDouble())
        {
            rad = sc.nextDouble();
        }
        double volume = 4.0 / 3.0 * mc.PI * mc.pow(rad, 3);
        System.out.println("Объем шара - " + volume);

        System.out.print("Введите вещественную и мнимую части комплексного числа: ");
        double re = 0, im = 0;
        if (sc.hasNextDouble())
        {
            re = sc.nextDouble();
        }
        if (sc.hasNextDouble())
        {
            im = sc.nextDouble();
        }
        System.out.println("Модуль числа - " + mc.abs_complex(re, im));
    }
}
