package task2;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    ArrayList<Student> students;
    @Override
    public int compare(Student o1, Student o2) {
        if (Double.compare(o1.gpa, o2.gpa) != 0)
            return Double.compare(o1.gpa, o2.gpa);
        else return Integer.compare(o1.idNumber, o2.idNumber);
    }

    public SortingStudentsByGPA() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        this.students.add(s);
    }

    public void sort(boolean reverse) {
        sort(0, students.size()-1);
        if (reverse)
            this.reverse();
    }

    private void reverse() {
        for (int i = 0; i < students.size() / 2; i++)
        {
            Student temp = students.get(i);
            students.set(i, students.get(students.size() - i - 1));
            students.set(students.size() - i - 1, temp);
        }
    }

    private void sort(int from, int to) {
        if (from >= to) return;
        Student pivot = students.get(to);
        int pivotIndex = from;
        for (int i = from; i < to; i++)
        {
            if (compare(students.get(i), pivot) <= 0)
            {
                Student temp = students.get(i);
                students.set(i, students.get(pivotIndex));
                students.set(pivotIndex, temp);
                pivotIndex++;
            }
        }
        Student temp = students.get(to);
        students.set(to, students.get(pivotIndex));
        students.set(pivotIndex, temp);
        sort(from, pivotIndex-1);
        sort(pivotIndex+1, to);
    }

    public void print() {
        for (Student s: students)
        {
            System.out.println(s);
        }
    }
}
