package task4;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegEx4 {
    String input;

    public RegEx4(String path) {
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
        Pattern pt = Pattern.compile("\\d\\D*\\+");
        Matcher mt = pt.matcher(input);
        while(mt.find())
        {
            System.out.println(mt.group());
        }
    }
}
