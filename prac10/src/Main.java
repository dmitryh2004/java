public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", "Ivanov", "09.03.04", 1, 1, 4.9),
                s2 = new Student("Petr", "Ivanov", "09.03.04", 1, 2,5.0),
                s3 = new Student("Ivan", "Petrov", "09.03.04", 2, 3, 4.6),
                s4 = new Student("Mihail", "Ivanov", "09.03.01", 1, 1, 4.0),
                s5 = new Student("Ivan", "Sidorov", "09.03.01", 1, 2, 4.4),
                s6 = new Student("Ivan", "Smirnov", "09.03.01", 1, 1,3.9),
                s7 = new Student("Kostantin", "Ivanov", "09.03.04", 1, 3, 3.6),
                s8 = new Student("Ivan", "Kuznetsov", "09.03.01", 1, 5,4.6);
        SortingStudents sl1 = new SortingStudents();
        sl1.addStudent(s1);
        sl1.addStudent(s2);
        sl1.addStudent(s3);
        sl1.addStudent(s4);
        sl1.addStudent(s5);
        SortingStudents sl2 = new SortingStudents();
        sl2.addStudent(s6);
        sl2.addStudent(s7);
        sl2.addStudent(s8);
        System.out.println("Списки 1 и 2 до сортировки:");
        sl1.print();
        System.out.println("----------------------------");
        sl2.print();
        System.out.println("============================");
        sl1.setSortingField("name");
        sl1.sort();
        sl2.setSortingField("group");
        sl2.setRevesedSort(true);
        sl2.sort();
        System.out.println("Списки 1 и 2 после сортировки (список 1 сортировался по имени, список 2 - по группе):");
        sl1.print();
        System.out.println("----------------------------");
        sl2.print();
        System.out.println("============================");
        System.out.println("Список 3 = Список 1 + Список 2 (отсортирован по gpa по убыванию):");
        SortingStudents res = new SortingStudents(sl1, sl2, true);
        res.print();
    }
}