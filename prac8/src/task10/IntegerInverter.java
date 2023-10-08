package task10;

public class IntegerInverter {


    public int InvertInteger(int input) {
        return InvertIntegerRec(input);
    }
    private int InvertIntegerRec(int input) {
        int temp = 0;
        if (input < 10)
        {
            temp = input;
        }
        else {
            int k = Integer.toString(input).length() - 1;
            temp = 10 * InvertIntegerRec(input % ((int)Math.pow(10, k))) + (input / ((int)Math.pow(10, k)));
        }
        return temp;
    }
}
