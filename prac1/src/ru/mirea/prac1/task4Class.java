package ru.mirea.prac1;

public class task4Class {
    public static void main(String[] args)
    {
        System.out.print("Первые 10 чисел гармонического ряда: ");
        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%.3f",(1.0f/i));
            if (i < 10) System.out.print(" ");
        }
    }
}
