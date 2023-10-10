package task6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String getLine(String path) {
        StringBuilder res = new StringBuilder();
        ArrayList<String> strings = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();

            while (line != null) {
                strings.addAll(Arrays.asList(line.split(" ")));
                line = reader.readLine();
            }
            reader.close();
            boolean done = false;
            res.append(strings.get(0));
            String last = strings.get(0);
            strings.remove(0);

            while (!done) {
                int last_size = res.length();
                if (strings.size() == 0) {
                    done = true;
                    break;
                }
                for (String s: strings) {
                    if (last.toLowerCase().charAt(last.length() - 1) == s.toLowerCase().charAt(0)) {
                        res.append(" ").append(s);
                        last = s;
                        strings.remove(s);
                        break;
                    }
                }
                if (last_size == res.length()) {
                    done = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String path = "";
        System.out.println("Введите путь к файлу: ");
        if (sc.hasNextLine())
            path = sc.nextLine();
        System.out.println(getLine(path));
    }
}
