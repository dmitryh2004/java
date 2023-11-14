package task3;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;

public class TextDocument implements IDocument {
    TextEditor FrameLink;
    String data;
    private final String[][] FILTERS = {{"txt", "Текстовые файлы (*.txt)"}};

    public TextDocument(TextEditor frameLink) {
        FrameLink = frameLink;
    }

    @Override
    public void save() {
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileFilterExt eff = new FileFilterExt(FILTERS[0][0], FILTERS[0][1]);
        fc.addChoosableFileFilter(eff);
        if(fc.showSaveDialog(FrameLink.frame) == JFileChooser.APPROVE_OPTION) {
            try {
                File f = fc.getSelectedFile();
                FileWriter fw = new FileWriter(f, false);
                this.data = this.FrameLink.textArea.getText();
                fw.write(this.data);
                fw.flush();
                fw.close();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Ошибка при сохранении файла",
                        "Ошибка",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }
}
