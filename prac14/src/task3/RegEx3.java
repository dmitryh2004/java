package task3;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegEx3 {
    String input;

    public RegEx3(String path) {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            String line = reader.readLine();
            while (line != null)
            {
                sb.append(line);
                line = reader.readLine();
            }
            this.input = sb.toString();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Ошибка: Файл не найден");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            System.out.println("Ошибка чтения файла");
            e.printStackTrace();
        }
    }

    public void work() {
        Pattern pt = Pattern.compile("[1-9]([0-9]*).([0-9]{2}) USD|[1-9]([0-9]*).([0-9]{2}) RUB|[1-9]([0-9]*).([0-9]{2}) EU");
        Matcher mt = pt.matcher(input);
        while(mt.find())
        {
            System.out.println(mt.group());
        }
    }
}
