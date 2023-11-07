package task1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] array1 = {"string a", "string b", "string c"};
        System.out.println("String array:\n" + Arrays.toString(array1));
        List<String> list1 = ConvertToList.convertToList(array1);
        System.out.println("String list:\n" + list1);
        Double[] array2 = {3.14, 2.71, 1.61};
        System.out.println("Double array:\n" + Arrays.toString(array2));
        List<Double> list2 = ConvertToList.convertToList(array2);
        System.out.println("Double list:\n" + list2);
    }
}
