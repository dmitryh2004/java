package task4_3;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class User {
    int balance = 0;
    String login, password;

    public int getBalance() {
        return balance;
    }

    public void buy(int price)
    {
        this.balance -= price;
    }

    public User()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите логин: ");
        if (sc.hasNextLine())
            login = sc.nextLine();
        System.out.print("Введите пароль: ");
        if (sc.hasNextLine())
            password = sc.nextLine();
        try {
            File file = new File("src/task4_3/Database.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null)
            {
                String[] splitLine = line.split(" ");
                if (splitLine[0].equals(this.login) && splitLine[1].equals(this.password))
                {
                    this.balance = Integer.parseInt(splitLine[2]);
                    System.out.println("Вы вошли в систему под именем " + this.login +
                            ". Ваш баланс: " + this.balance + " р.");
                    break;
                }
                line = reader.readLine();
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Ошибка: База данных не найдена");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            System.out.println("Ошибка чтения файла базы данных");
            e.printStackTrace();
        }
    }
}
