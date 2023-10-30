package task3;

public class View {
    MainFrame mainFrame;

    public View(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public void updateMainFrame(int value1, int value2, int value3)
    {
        mainFrame.updateValues(value1, value2, value3);
    }
}
