package task1_1;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вариант 1: Random.nextDouble()");
        Random rand = new Random();
        double[] array1 = new double[15];
        double swap_var;
        System.out.print("Массив до сортировки: [");
        for (int i = 0; i < 15; i++)
        {
            array1[i] = rand.nextDouble();
            System.out.printf("%.4f; ", array1[i]);
        }
        System.out.println("]");
        //сортировка
        for (int i = 0; i < 15; i++)
        {
            for (int j = 0; j < 15; j++) {
                if (array1[i] < array1[j])
                {
                    swap_var = array1[j];
                    array1[j] = array1[i];
                    array1[i] = swap_var;
                }
            }
        }
        System.out.print("Массив после сортировки: [");
        for (int i = 0; i < 15; i++)
        {
            System.out.printf("%.4f; ", array1[i]);
        }
        System.out.println("]");

        System.out.println("Вариант 2: Math.random()");
        double[] array2 = new double[15];
        System.out.print("Массив до сортировки: [");
        for (int i = 0; i < 15; i++)
        {
            array2[i] = Math.random();
            System.out.printf("%.4f; ", array2[i]);
        }
        System.out.println("]");
        //сортировка
        for (int i = 0; i < 15; i++)
        {
            for (int j = 0; j < 15; j++) {
                if (array2[i] < array2[j])
                {
                    swap_var = array2[j];
                    array2[j] = array2[i];
                    array2[i] = swap_var;
                }
            }
        }
        System.out.print("Массив после сортировки: [");
        for (int i = 0; i < 15; i++)
        {
            System.out.printf("%.4f; ", array2[i]);
        }
        System.out.println("]");
    }
}
