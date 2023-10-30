package task1;

public class StudentController {
    private Student student;
    private StudentView view;

    public StudentController(Student student, StudentView view) {
        this.student = student;
        this.view = view;
    }

    public String getStudentName() {
        return student.getName();
    }

    public void setStudentName(String newName) {
        this.student.setName(newName);
    }

    public String getStudentRollNo() {
        return student.getRollNo();
    }

    public void setStudentRollNo(String newRollNo) {
        this.student.setRollNo(newRollNo);
    }

    public void updateView() {
        view.printStudentDetails(getStudentRollNo(), getStudentName());
    }
}
