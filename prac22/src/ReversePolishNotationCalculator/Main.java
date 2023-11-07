package ReversePolishNotationCalculator;

import ReversePolishNotationCalculator.frontend.MainFrame;
import ReversePolishNotationCalculator.frontend.RPNCalcController;
import ReversePolishNotationCalculator.frontend.RPNCalcModel;
import ReversePolishNotationCalculator.frontend.RPNCalcView;

public class Main {
    public static void main(String[] args) {
        MainFrame mf = new MainFrame();
        RPNCalcView v = new RPNCalcView(mf);
        RPNCalcModel m = new RPNCalcModel();
        RPNCalcController c = new RPNCalcController(m, v);
        mf.setController(c);
    }
}
