package task1;

import java.util.ArrayList;

public class SortingClass {
    ArrayList<Student> students;

    public SortingClass() {
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void sortStudents() {
        for (int i = 0; i < students.size(); i++)
        {
            for (int j = i; j > 0; j--)
            {
                if (students.get(j).compareTo(students.get(j-1)) < 0)
                {
                    Student temp = students.get(j);
                    students.set(j, students.get(j-1));
                    students.set(j-1, temp);
                }
            }
        }
    }

    public void print() {
        for (Student s: students)
        {
            System.out.println(s);
        }
    }
}
