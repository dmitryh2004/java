package task6;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegEx6 {
    String input;

    public RegEx6(String path) {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            String line = reader.readLine();
            while (line != null)
            {
                sb.append(line).append("\n");
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
        Pattern pt = Pattern.compile("\\w+@\\w+(.\\w+)?");
        System.out.println(pt.toString());
        Matcher mt = pt.matcher(input);
        while(mt.find())
        {
            System.out.println(mt.group());
        }
    }
}
