package task5;

public class Dog {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getHumanAge()
    {
        return 7 * this.getAge();
    }

    public String toString()
    {
        return ("{Собака - кличка " + this.getName() + ", возраст - " + this.getAge() + "}");
    }
}
