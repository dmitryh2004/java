package ReversePolishNotationCalculator;

import ReversePolishNotationCalculator.backend.CalcRPNExpression;
import ReversePolishNotationCalculator.backend.IllegalRPNExpressionCalc;

public class Main {
    public static void main(String[] args) {
        CalcRPNExpression rpne = new CalcRPNExpression();
        try {
            System.out.println(rpne.calcExpression("2 4 / 1 + 2"));

        } catch (IllegalRPNExpressionCalc illegalRPNExpressionCalc) {
            illegalRPNExpressionCalc.printStackTrace();
        }
    }
}
