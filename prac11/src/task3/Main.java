package task3;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar date1 = Calendar.getInstance();
        date1.set(Calendar.YEAR, 2003);
        date1.set(Calendar.MONTH, 5);
        date1.set(Calendar.DAY_OF_MONTH, 22);
        Calendar date2 = Calendar.getInstance();
        date2.set(Calendar.YEAR, 1998);
        date2.set(Calendar.MONTH, 7);
        date2.set(Calendar.DAY_OF_MONTH, 8);
        Calendar date3 = Calendar.getInstance();
        date3.set(Calendar.YEAR, 2002);
        date3.set(Calendar.MONTH, 1);
        date3.set(Calendar.DAY_OF_MONTH, 24);
        Student s1 = new Student("Иван", "Иванов",
                "09.03.04", 1, 1, 4.8, date1);
        Student s2 = new Student("Михаил", "Петров",
                "09.03.04", 5, 6, 4.1, date2);
        Student s3 = new Student("Василий", "Сидоров",
                "09.03.04", 1, 8, 4.5, date3);
        System.out.println(s1.toString(0) + "\n" + s2.toString(1));
        System.out.println(s3.toString(2));
    }
}
