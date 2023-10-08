package task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zero = 0, one = 0;
        System.out.println("Введите количество нулей:");
        if (sc.hasNextInt())
        {
            zero = sc.nextInt();
        }
        System.out.println("Введите количество единиц:");
        if (sc.hasNextInt())
        {
            one = sc.nextInt();
        }
        TwoZerosChecker tzc = new TwoZerosChecker(zero, one);
        System.out.println("Количество последовательностей без двух соседних нулей: " + tzc.getCount());
    }
}
