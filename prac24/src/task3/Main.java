package task3;

public class Main {
    public static void main(String[] args) {
        TextEditor te = new TextEditor("Text editor");
        te.fileCreator = new CreateTextDocument(te);
        te.fileContent = te.fileCreator.createNew();
    }
}
