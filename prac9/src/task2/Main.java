package task2;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(123, 4.9),
                s2 = new Student(133, 5.0),
                s3 = new Student(1323, 4.6),
                s4 = new Student(7, 3.5);
        SortingStudentsByGPA sc = new SortingStudentsByGPA();
        sc.addStudent(s1);
        sc.addStudent(s4);
        sc.addStudent(s3);
        sc.addStudent(s2);
        sc.print();
        System.out.println("-----------------------------------------------");
        sc.sort(true);
        sc.print();
    }
}
