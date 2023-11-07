package ReversePolishNotationCalculator.frontend;

public class RPNCalcView {
    MainFrame mainFrame;

    public RPNCalcView (MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public void updateMainFrame(String value) {
        mainFrame.updateValue(value);
    }
}
