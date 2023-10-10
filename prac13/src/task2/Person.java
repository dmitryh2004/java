package task2;

public class Person {
    String surname;
    String name;
    String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
        this.patronymic = "";
    }

    public Person(String surname) {
        this.surname = surname;
        this.name = "";
        this.patronymic = "";
    }

    public String getFIO() {
        StringBuilder temp = new StringBuilder();
        temp.append(this.surname);
        if (!this.name.equals("")) {
            temp.append(" ");
            temp.append(this.name);
        }
        if (!this.patronymic.equals("")) {
            temp.append(" ");
            temp.append(this.patronymic);
        }
        return temp.toString();
    }
}
