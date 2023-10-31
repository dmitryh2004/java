package ReversePolishNotationCalculator.backend.RPNStack;

public class RPNNode {
    private String value;
    private RPNNode prev;

    public RPNNode(String value) {
        this.value = value;
        this.prev = null;
    }

    public String getValue() {
        return value;
    }

    public RPNNode getPrev() {
        return prev;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setPrev(RPNNode prev) {
        this.prev = prev;
    }

    public void show() {
        System.out.println(this.value);
        if (this.prev != null)
        {
            this.prev.show();
        }
    }
}
