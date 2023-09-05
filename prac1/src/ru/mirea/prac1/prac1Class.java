package ru.mirea.prac1;
import java.util.Scanner;

public class prac1Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] test = new float[10];
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Введите число №"+(i+1));
            if (sc.hasNextFloat())
            {
                test[i] = sc.nextFloat();
            }
        }
        System.out.println("Вы ввели: ");
        for (int i = 0; i < 10; i++)
        {
            System.out.print(test[i]);
            if (i < 9) System.out.println("");
        }
    }
}
