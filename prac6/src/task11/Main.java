package task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Converter conv = new Converter();
        int mode = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите тип исходной температуры: 1 - Цельсии, 2 - Фаренгейты");
        if (sc.hasNextInt())
        {
            mode = sc.nextInt();
            if (mode < 1) mode = 1;
            if (mode > 2) mode = 2;
        }
        System.out.println("Введите количество градусов");
        float temp = 0.0f;
        if (sc.hasNextFloat())
        {
            temp = sc.nextFloat();
        }
        switch(mode)
        {
            case 1:
                System.out.println(temp + " градусов Цельсия в Фаренгейтах: " + conv.toFar(temp));
                break;
            case 2:
                System.out.println(temp + " градусов Фаренгейта в Цельсиях: " + conv.toCel(temp));
                break;
        }
    }
}
