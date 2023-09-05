package ru.mirea.prac1;
import java.util.Scanner;

public class task5Class {
    public static int fact(int n)
    {
        int res = 1;
        int k = n;
        while (k > 1)
        {
            res *= k;
            k--;
        }
        return res;
    }

    public static void main(String[] args)
    {
        int k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        if (sc.hasNextInt()) k = sc.nextInt();
        if (k < 0)
            System.out.print(k + "! не определен");
        else
            System.out.print(k + "! = " + fact(k));
    }
}
