package task3;

public class Main {
    public static void main(String[] args) {
        MainFrame mf = new MainFrame();
        View v = new View(mf);
        Model m = new Model();
        Controller c = new Controller(m, v);
        mf.setController(c);
    }
}
