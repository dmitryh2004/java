package task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку для проверки на палиндром: ");
        if (sc.hasNextLine())
            str = sc.nextLine();
        PalindromChecker pc = new PalindromChecker();
        if (pc.isPalindrom(str))
            System.out.println("Это палиндром");
        else
            System.out.println("Это не палиндром");
    }
}
