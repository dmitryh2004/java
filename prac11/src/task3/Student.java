package task3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student {
    String name;
    String surname;
    String prof;
    int course;
    int group;
    double gpa;
    Calendar birthday;

    public Student(String name, String surname, String prof, int course, int group, double gpa,
                   Calendar birthday) {
        this.name = name;
        this.surname = surname;
        this.prof = prof;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        String temp = "";
        temp += "Фамилия, имя: " + surname + " " + name;
        temp += ", специальность: " + prof;
        temp += ", курс: " + course + ", группа: " + group;
        temp += ", средний балл: " + gpa;
        SimpleDateFormat sdf = new SimpleDateFormat("E dd.mm.yyyy");
        temp += "\nДата рождения: " + sdf.format(this.birthday.getTime());
        return temp;
    }

    public String toString(int mode) {
        String temp = "";
        temp += "Фамилия, имя: " + surname + " " + name;
        temp += ", специальность: " + prof;
        temp += ", курс: " + course + ", группа: " + group;
        temp += ", средний балл: " + gpa;
        SimpleDateFormat sdf;
        switch (mode)
        {
            case 1: sdf = new SimpleDateFormat("E, dd.MM.yyyy"); break;
            case 2: sdf = new SimpleDateFormat("EEEE, dd MMMM yyyy"); break;
            default: sdf = new SimpleDateFormat("dd.MM.yy");
        }
        temp += "\nДата рождения: " + sdf.format(this.birthday.getTime());
        return temp;
    }
}
