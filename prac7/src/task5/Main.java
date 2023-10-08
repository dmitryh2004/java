package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "";
        StringEditor strEdit = new StringEditorClass();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        if (sc.hasNextLine())
        {
            str = sc.nextLine();
        }
        System.out.println("Длина строки - " + strEdit.stringSize(str));
        System.out.println("Строка из нечетных символов - " + strEdit.getUnevenChars(str));
        System.out.println("Инвертированная строка - " + strEdit.invertString(str));
    }
}
