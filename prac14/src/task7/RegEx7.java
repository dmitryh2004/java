package task7;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegEx7 {
    String input;

    public RegEx7(String path) {
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
        Pattern ptMain = Pattern.compile("(\\w){8,}"),
                ptCapital = Pattern.compile("[A-Z]+"),
                ptSmall = Pattern.compile("[a-z]+"),
                ptDigit = Pattern.compile("[0-9]+");
        Matcher mtMain = ptMain.matcher(input);
        while(mtMain.find())
        {
            String res = mtMain.group();
            Matcher mtCapital = ptCapital.matcher(res);
            Matcher mtSmall = ptSmall.matcher(res);
            Matcher mtDigit = ptDigit.matcher(res);
            if ((!mtCapital.find()) || (!mtSmall.find()) || (!mtDigit.find())) {
                continue;
            }
            System.out.println(res);
        }
    }
}
