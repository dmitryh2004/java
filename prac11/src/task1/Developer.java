package task1;

import java.util.Date;

public class Developer {
    String surname;
    Date taskReceived;
    Date taskCompleted;

    public Developer(String surname, Date taskReceived) {
        this.surname = surname;
        this.taskReceived = taskReceived;
        this.taskCompleted = new Date(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return "Developer{" +
                "surname='" + surname + '\'' +
                ", taskReceived=" + taskReceived +
                ", taskCompleted=" + taskCompleted +
                '}';
    }
}
