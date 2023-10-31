package ReversePolishNotationCalculator.backend;

public class IllegalRPNExpressionCalc extends Throwable {
    public IllegalRPNExpressionCalc(String e, String stackContent) {
        super("Illegal RPN expression (input: " + e + ", stack content: " + stackContent + ")");
    }
}
