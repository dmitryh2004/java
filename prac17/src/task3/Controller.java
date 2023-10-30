package task3;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public int getModelValue1() {
        return model.getValue1();
    }

    public void incModelValue1() {
        this.model.setValue1(this.model.getValue1() + 1);
    }

    public void decModelValue1() {
        this.model.setValue1(this.model.getValue1() - 1);
    }

    public int getModelValue2() {
        return model.getValue2();
    }

    public void incModelValue2() {
        this.model.setValue2(this.model.getValue2() + 1);
    }

    public void decModelValue2() {
        this.model.setValue2(this.model.getValue2() - 1);
    }

    public int getModelValue3() {
        return model.getValue3();
    }

    public void incModelValue3() {
        this.model.setValue3(this.model.getValue3() + 1);
    }

    public void decModelValue3() {
        this.model.setValue3(this.model.getValue3() - 1);
    }

    public void updateView() {
        this.view.updateMainFrame(this.getModelValue1(), this.getModelValue2(), this.getModelValue3());
    }
}
