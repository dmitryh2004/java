package ReversePolishNotationCalculator.backend;

import ReversePolishNotationCalculator.backend.RPNStack.RPNStack;

public class CalcRPNExpression {
    private RPNStack stack = new RPNStack();

    private void collapseExpression() {
        while(true) {
            int curLength = stack.getLength();
            String topString = stack.getTop().getValue();
            if (topString.matches("[+\\-*.\\/]"))
            {
                String a1 = stack.getNthElement(2).getValue(), a2 = stack.getNthElement(1).getValue();
                try {
                    double d1 = Double.parseDouble(a1);
                    double d2 = Double.parseDouble(a2);
                    switch (topString) {
                        case "+":
                            stack.pop();
                            stack.pop();
                            stack.pop();
                            stack.push(String.valueOf(d1 + d2));
                            break;
                        case "-":
                            stack.pop();
                            stack.pop();
                            stack.pop();
                            stack.push(String.valueOf(d1 - d2));
                            break;
                        case "*":
                            stack.pop();
                            stack.pop();
                            stack.pop();
                            stack.push(String.valueOf(d1 * d2));
                            break;
                        case "/":
                            stack.pop();
                            stack.pop();
                            stack.pop();
                            stack.push(String.valueOf(d1 / d2));
                            break;
                    }
                }
                catch (NumberFormatException e) {
                    StringBuilder stackContent = new StringBuilder();
                    do {
                        stackContent.append(stack.pop().getValue());
                        stackContent.append(" ");
                    } while (!stack.isEmpty());
                    throw new IllegalRPNExpression(stackContent.toString());
                }
            }
            if (curLength == stack.getLength()) break;
        }
    }

    public double calcExpression(String e) throws IllegalRPNExpressionCalc
    {
        try {
            String[] splits = e.split(" ");
            for (String s : splits) {
                stack.push(s);
                collapseExpression();
            }
        }
        catch (IllegalRPNExpression exc) {
            StringBuilder stackContent = new StringBuilder();
            do {
                stackContent.append(stack.pop().getValue());
                stackContent.append(" ");
            } while (!stack.isEmpty());
            throw new IllegalRPNExpressionCalc(e, stackContent.toString());
        }
        if (stack.getLength() != 1) {
            StringBuilder stackContent = new StringBuilder();
            do {
                stackContent.append(stack.pop().getValue());
                stackContent.append(" ");
            } while (!stack.isEmpty());
            throw new IllegalRPNExpressionCalc(e, stackContent.toString());
        }
        return Double.parseDouble(stack.getTop().getValue());
    }
}
