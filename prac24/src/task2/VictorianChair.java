package task2;

public class VictorianChair implements Chair {
    private int age;
    public VictorianChair(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public String toString() {
        return "Викторианский стул";
    }
}
