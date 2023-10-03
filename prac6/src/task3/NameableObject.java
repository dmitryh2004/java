package task3;

public class NameableObject implements Nameable {
    private String name;

    public NameableObject()
    {
        this.name = "Generic name";
    }

    public NameableObject(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
