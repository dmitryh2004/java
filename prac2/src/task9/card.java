package task9;

public class card {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public card(String name) {
        this.name = name;
    }

    public String toString()
    {
        return this.name;
    }
}
