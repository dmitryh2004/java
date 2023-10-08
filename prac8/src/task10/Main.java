package task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        System.out.println("Введите целое число без нулей:");
        if (sc.hasNextInt())
        {
            a = sc.nextInt();
        }
        IntegerInverter ii = new IntegerInverter();
        System.out.println("Перевернутое число - " + ii.InvertInteger(a));
    }
}
