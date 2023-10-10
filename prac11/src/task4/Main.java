package task4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day = 0, month = 0, year = 0, hour = 0, minutes = 0;
        Calendar cal = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводите последовательно год, месяц, день, часы и минуты:");
        if (sc.hasNextInt())
        {
            year = sc.nextInt();
        }
        if (sc.hasNextInt())
        {
            month = sc.nextInt();
        }
        if (sc.hasNextInt())
        {
            day = sc.nextInt();
        }
        if (sc.hasNextInt())
        {
            hour = sc.nextInt();
        }
        if (sc.hasNextInt())
        {
            minutes = sc.nextInt();
        }
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minutes);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd\nHH:mm");
        System.out.println("Введенная дата: \n" + sdf.format(cal.getTime()));
    }
}
