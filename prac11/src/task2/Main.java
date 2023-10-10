package task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day = 0, month = 0, year = 0, hour = 0, minutes = 0, secs = 0;
        Calendar cal = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводите последовательно год, месяц, день, часы, минуты и секунды:");
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
        if (sc.hasNextInt())
        {
            secs = sc.nextInt();
        }
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minutes);
        cal.set(Calendar.SECOND, secs);
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy, HH:mm:ss");
        System.out.println("Введенная дата: " + sdf.format(cal.getTime()));
        Calendar calCur = Calendar.getInstance();
        System.out.println("Текущая дата: " + sdf.format(calCur.getTime()));
        int compRes = cal.compareTo(calCur);
        if (compRes < 0) System.out.println("Введенная дата меньше текущего времени");
        else if (compRes > 0) System.out.println("Введенная дата больше текущего времени");
        else System.out.println("Введенная дата равна текущему времени");
    }
}
