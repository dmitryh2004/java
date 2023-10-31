package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserChecker uc = new UserChecker();
        Scanner sc = new Scanner(System.in);
        String fio, inn;
        System.out.print("Введите Фамилию И.О. -> ");
        fio = sc.nextLine();
        System.out.print("Введите свой ИНН -> ");
        inn = sc.nextLine();

        try {
            uc.check(fio, inn);
        }
        catch (BadFIOException | InnIsNotValidException e)
        {
            System.out.println("Идентификация провалена");
            System.out.println(e.getMessage());
        }
    }
}
