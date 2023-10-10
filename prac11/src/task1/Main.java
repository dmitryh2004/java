package task1;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date();
        date1.setYear(1984-1900);
        date1.setMonth(Calendar.JANUARY);
        date1.setDate(1);
        Date date2 = new Date();
        date2.setYear(2012-1900);
        date2.setMonth(Calendar.MAY);
        date2.setDate(15);
        Developer dev1 = new Developer("Petrov", date1),
                dev2 = new Developer("Ivanov", date2);
        System.out.println(dev1 + "\n" + dev2);
    }
}
