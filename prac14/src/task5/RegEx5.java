package task5;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegEx5 {
    String input;

    public RegEx5(String path) {
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
        Pattern pt = Pattern.compile(
                "(" +
                    "(" +
                        "(" +
                                "(0[1-9]|[12][0-9]|3[01])" +
                                "/" +
                                "0[13578]|1[02]" +
                        ")" +
                        "|" +
                        "(" +
                                "(0[1-9]|[12][0-9]|30)" +
                                "/" +
                                "0[469]|11" +
                        ")" +
                        "|" +
                        "(" +
                                "(0[1-9]|1[0-9]|2[0-8])" +
                                "/" +
                                "02" +
                        ")" +
                    ")" +
                    "/" +
                    "((19[0-9][0-9])|([2-9][0-9][0-9][0-9]))" + //не високосный год
                ")" +
                "|" +
                "(" +
                    "(0[1-9]|[12][0-9])" +
                    "/" +
                    "02" +
                    "/" +
                    "(" +
                        "([1-9][0-9]([02468][048]|[13579][26]))" +
                        "|" +
                        "([2468][048]|[13579][26])00" +
                    ")" + //високосный год
                ")"
        );
        System.out.println(pt.toString());
        Matcher mt = pt.matcher(input);
        while(mt.find())
        {
            System.out.println(mt.group());
        }
    }
}
