package task2;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Иванов", "Иван", "Иванович"),
                p2 = new Person("Иванов", "Иван"),
                p3 = new Person("Иванов");
        System.out.println(p1.getFIO());
        System.out.println(p2.getFIO());
        System.out.println(p3.getFIO());
    }
}
