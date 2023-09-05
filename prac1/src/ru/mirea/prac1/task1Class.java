package ru.mirea.prac1;
import java.util.Scanner;

public class task1Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = 0;
        System.out.print("Введите количество элементов массива: ");
        if (sc.hasNextInt())
        {
            amount = sc.nextInt();
        }
        int[] nums = new int[amount];
        int sum = 0;
        float mean = 0.0f;
        for (int i = 0; i < amount; i++)
        {
            System.out.print("Введите элемент массива №"+ (i+1) +": ");
            if (sc.hasNextInt())
            {
                nums[i] = sc.nextInt();
                sum += nums[i];
            }
        }
        mean = (float)sum / amount;
        System.out.println("Сумма элементов массива - " + sum + "; среднее - " + mean);
    }
}
