package ReversePolishNotationCalculator.backend.RPNStack;

public class RPNStack {
    private RPNNode top;
    private int length;

    public RPNStack() {
        this.length = 0;
        this.top = null;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public void push(String value) {
        RPNNode temp = new RPNNode(value);
        temp.setPrev(this.top);
        this.top = temp;
        length++;
    }

    public RPNNode pop() {
        if (!this.isEmpty())
        {
            RPNNode temp = this.top;
            this.top = this.top.getPrev();
            this.length--;
            return temp;
        }
        else {
            return null;
        }
    }

    public RPNNode getTop() {
        return top;
    }

    public RPNNode getNthElement(int n) { //0 - top
        if (n > this.length) return null;
        int i = 0;
        RPNNode res = this.top;
        while (i < n)
        {
            res = res.getPrev();
            i++;
        }
        return res;
    }

    public int getLength() {
        return length;
    }
}
