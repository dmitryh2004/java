package task1_4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число n: ");

        int n = 0;
        while(true) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("Повторите ввод: число n должно быть больше 0");
                    continue;
                }
                break;
            }
        }

        int even_n = 0;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = rand.nextInt(0, n);
            if (nums[i] % 2 == 0) even_n++;
        }
        System.out.println("Массив: " + Arrays.toString(nums));
        int[] even_nums = new int[even_n];
        even_n = 0;
        for (int i = 0; i < n; i++)
        {
            if (nums[i] % 2 == 0)
            {
                even_nums[even_n++] = nums[i];
            }
        }
        System.out.println("Четные числа массива, если они есть: " + Arrays.toString(even_nums));
    }
}
