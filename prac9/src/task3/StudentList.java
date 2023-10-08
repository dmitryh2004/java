package task3;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentList implements Comparator<Student> {
    ArrayList<Student> students;
    public int compare(Student o1, Student o2) {
        if (Double.compare(o1.gpa, o2.gpa) != 0)
            return Double.compare(o1.gpa, o2.gpa);
        else return Integer.compare(o1.idNumber, o2.idNumber);
    }
    public StudentList() {
        students = new ArrayList<>();
    }

    public StudentList(StudentList l1, StudentList l2) {
        students = new ArrayList<>();
        students.addAll(l1.students);
        students.addAll(l2.students);
        ArrayList<Student> temp = new ArrayList<>(this.students);
        sort(temp, 0, students.size() - 1);
    }

    public void addStudent(Student s) {
        this.students.add(s);
    }

    private void sort(ArrayList<Student> temp, int start, int end) {
        if (start == end) return;
        int mid = start + ((end - start) >> 1);
        sort(temp, start, mid);
        sort(temp, mid+1, end);
        sort_merge(temp, start, mid, end);
    }

    private void sort_merge(ArrayList<Student> temp, int start, int mid, int end) {
        int merged_index = start, i = start, j = mid+1;
        while ((i <= mid) && (j <= end))
        {
            if (compare(students.get(i), students.get(j)) <= 0)
            {
                temp.set(merged_index, students.get(i));
                merged_index++;
                i++;
            }
            else {
                temp.set(merged_index, students.get(j));
                merged_index++;
                j++;
            }
        }
        while (i <= mid)
        {
            temp.set(merged_index, students.get(i));
            merged_index++;
            i++;
        }
        while (j <= end)
        {
            temp.set(merged_index, students.get(j));
            merged_index++;
            j++;
        }
        for (i = start; i <= end; i++)
        {
            students.set(i, temp.get(i));
        }
    }

    public void print() {
        for (Student s: students)
        {
            System.out.println(s);
        }
    }
}
