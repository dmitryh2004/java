package task1;

public class Main {
    public static void main(String[] args) {
        StudentController sc = new StudentController(new Student("123", "Иванов И. И."), new StudentView());
        sc.updateView();
        sc.setStudentRollNo("not 123");
        sc.setStudentName("Петров П. П.");
        sc.updateView();
    }
}
