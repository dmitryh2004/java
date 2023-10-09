public class Student {
    String name;
    String surname;
    String prof;
    int course;
    int group;
    double gpa;

    public Student(String name, String surname, String prof, int course, int group, double gpa) {
        this.name = name;
        this.surname = surname;
        this.prof = prof;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", prof='" + prof + '\'' +
                ", course=" + course +
                ", group=" + group +
                ", gpa=" + gpa +
                '}';
    }
}
