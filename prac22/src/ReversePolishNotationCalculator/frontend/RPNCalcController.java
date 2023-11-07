package ReversePolishNotationCalculator.frontend;

public class RPNCalcController {
    private RPNCalcModel model;
    private RPNCalcView view;

    public RPNCalcController(RPNCalcModel model, RPNCalcView view) {
        this.model = model;
        this.view = view;
    }

    public double getLastResult() {
        return this.model.getLastResult();
    }


    public void calculateExpression(String expression) {
        this.model.calcExpression(expression);
        if (Double.isNaN(getLastResult())) {
            updateView("Ошибка в записи выражения.");
        }
        else {
            updateView(String.valueOf(getLastResult()));
        }
    }

    public void updateView (String value) {
        this.view.updateMainFrame(value);
    }
}
