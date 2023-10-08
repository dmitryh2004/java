package task1;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(123), s2 = new Student(133), s3 = new Student(1323), s4 = new Student(7);
        SortingClass sc = new SortingClass();
        sc.addStudent(s1);
        sc.addStudent(s4);
        sc.addStudent(s3);
        sc.addStudent(s2);
        sc.print();
        System.out.println("-----------------------------------------------");
        sc.sortStudents();
        sc.print();
    }
}