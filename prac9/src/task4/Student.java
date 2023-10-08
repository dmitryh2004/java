package task4;

public class Student implements Comparable<Student> {
    int idNumber;
    double gpa;

    public Student(int idNumber, double gpa) {
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student second) {
        if (Double.compare(this.gpa, second.gpa) != 0)
            return Double.compare(this.gpa, second.gpa);
        else return Integer.compare(this.idNumber, second.idNumber);
    }
}
