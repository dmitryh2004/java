package task3;

public class Student {
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
}
