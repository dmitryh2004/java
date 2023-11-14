package task3;

import javax.swing.*;

public class TextEditor extends WindowTemplate {
    JTextArea textArea = new JTextArea(25, 50);

    public TextEditor(String name) {
        super(name);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        frame.add(new JScrollPane(textArea));
        frame.pack();
    }
}
