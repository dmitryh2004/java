package task8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводите строки, разделяя их нажатием Enter. Введите \"0-0\", чтобы закончить ввод:");
        String temp = "";
        while(!temp.equals("0-0"))
        {
            if (sc.hasNextLine())
            {
                temp = sc.nextLine();
                if (!temp.equals("0-0")) strings.add(temp);
            }
        }
        System.out.println("Введенный массив строк:");
        System.out.println(strings);
        for (int i = 0; i < (strings.size() / 2); i++)
        {
            Collections.swap(strings, i, strings.size() - 1 - i);
        }
        System.out.println("Перевернутый массив строк:");
        System.out.print(strings);
    }
}
