package task3;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(123, 4.9),
                s2 = new Student(133, 5.0),
                s3 = new Student(1323, 4.6),
                s4 = new Student(7, 3.5),
                s5 = new Student(1234, 4.4),
                s6 = new Student(1334, 3.9),
                s7 = new Student(1324, 3.6),
                s8 = new Student(746, 4.6);
        StudentList sl1 = new StudentList();
        sl1.addStudent(s1);
        sl1.addStudent(s2);
        sl1.addStudent(s3);
        sl1.addStudent(s4);
        sl1.addStudent(s5);
        StudentList sl2 = new StudentList();
        sl2.addStudent(s6);
        sl2.addStudent(s7);
        sl2.addStudent(s8);
        sl1.print();
        System.out.println("----------------------------");
        sl2.print();
        System.out.println("============================");
        StudentList res = new StudentList(sl1, sl2);
        res.print();
    }
}
