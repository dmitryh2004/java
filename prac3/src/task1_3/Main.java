package task1_3;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++)
        {
            nums[i] = rand.nextInt(10, 99);
            System.out.println(nums[i]);
        }
        boolean isGrowing = true;
        for (int i = 0; i < 3; i++)
        {
            if (nums[i+1] <= nums[i])
            {
                isGrowing = false;
                break;
            }
        }
        System.out.println("Массив " + (isGrowing? "" : "не ") + "является строго возрастающей последовательностью");
    }
}
