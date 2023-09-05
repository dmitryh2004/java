package ru.mirea.prac1;
import java.util.Scanner;

public class task2Class {
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
        int min = 0, max = 0;
        int i = 0;
        while(i < amount)
        {
            System.out.print("Введите элемент массива №"+ (i+1) +": ");
            if (sc.hasNextInt())
            {
                nums[i] = sc.nextInt();
                sum += nums[i];
                if (i == 0) min = nums[i];
                else if (min > nums[i]) min = nums[i];
                if (i == 0) max = nums[i];
                else if (max < nums[i]) max = nums[i];
                i++;
            }
        }
        System.out.println("Сумма элементов массива - " + sum + "; минимальное значение - " + min +
                ", максимальное - "+ max);
    }
}
