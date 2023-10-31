package ReversePolishNotationCalculator.backend;

public class IllegalRPNExpression extends RuntimeException {
    public IllegalRPNExpression(String stackContent) {
        super("Illegal RPN expression (stack content: " + stackContent + ")");
    }
}
