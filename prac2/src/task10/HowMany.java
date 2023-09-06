package task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        String input = "";
        String[] input_split;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        if (sc.hasNextLine())
        {
            input = sc.nextLine();
        }
        int words = 0;
        input_split = input.split(" +");
        for (int i = 0; i < input_split.length; i++)
        {
            if (!((input_split[i].equals("-")) || (input_split[i].equals(";")) || (input_split[i].equals(".")) ||
                    (input_split[i].equals("!")) || (input_split[i].equals("?")) || (input_split[i].equals(":")) ||
                    (input_split[i].equals(","))))
            {
                words++;
            }
        }
        System.out.println("Введено слов: " + words);
    }
}
