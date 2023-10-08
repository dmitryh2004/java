package task1;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    int idNumber;

    public Student(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }



    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.idNumber, o.idNumber);
    }
}
