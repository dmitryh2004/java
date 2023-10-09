import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudents implements Comparator<Student> {
    private ArrayList<Student> students;
    private String sortingField = "gpa";
    private boolean revesedSort;

    public SortingStudents() {
        students = new ArrayList<>();
        this.revesedSort = false;
    }

    public SortingStudents(SortingStudents s1, SortingStudents s2, boolean revesedSort) {
        students = new ArrayList<>();
        this.revesedSort = revesedSort;
        students.addAll(s1.students);
        students.addAll(s2.students);
        ArrayList<Student> temp = new ArrayList<>(students);
        mergeSort(temp, 0, students.size() - 1);
    }

    public void addStudent(Student s)
    {
        students.add(s);
    }

    public void setSortingField(String sortingField) {
        switch (sortingField) {
            case "name", "surname", "prof", "course", "group", "gpa" -> this.sortingField = sortingField;
            default -> System.out.println("Неверное поле для сортировки");
        }
    }

    public void setRevesedSort(boolean revesedSort) {
        this.revesedSort = revesedSort;
    }

    public void sort() {
        quickSort(0, this.students.size() - 1);
    }

    private void quickSort(int from, int to) {
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
        quickSort(from, pivotIndex-1);
        quickSort(pivotIndex+1, to);
    }

    private void mergeSort(ArrayList<Student> temp, int start, int end) {
        if (start == end) return;
        int mid = start + ((end - start) >> 1);
        mergeSort(temp, start, mid);
        mergeSort(temp, mid+1, end);
        merge(temp, start, mid, end);
    }

    private void merge (ArrayList<Student> temp, int start, int mid, int end) {
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
        for (Student s:students)
        {
            System.out.println(s);
        }
    }

    @Override
    public int compare(Student o1, Student o2) {
        int compResult = 0;
        switch (sortingField) {
            case "name" -> compResult = o1.name.compareTo(o2.name);
            case "surname" -> compResult = o1.surname.compareTo(o2.surname);
            case "prof" -> compResult = o1.prof.compareTo(o2.prof);
            case "course" -> compResult = Integer.compare(o1.course, o2.course);
            case "group" -> compResult = Integer.compare(o1.group, o2.group);
            case "gpa" -> compResult = Double.compare(o1.gpa, o2.gpa);
        }
        compResult *= (this.revesedSort ? -1 : 1);
        return compResult;
    }
}
