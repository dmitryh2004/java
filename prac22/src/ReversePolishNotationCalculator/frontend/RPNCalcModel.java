package ReversePolishNotationCalculator.frontend;

import ReversePolishNotationCalculator.backend.*;
public class RPNCalcModel {
    CalcRPNExpression calcRPN;
    double lastResult = 0.0;

    public RPNCalcModel() {
        this.calcRPN = new CalcRPNExpression();
    }

    public void calcExpression (String exp) {
        try {
            lastResult = this.calcRPN.calcExpression(exp);
        }
        catch (IllegalRPNExpressionCalc e) {
            lastResult = Double.NaN;
        }
    }

    public double getLastResult() {
        return lastResult;
    }
}
