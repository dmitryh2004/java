package task3;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CreateTextDocument implements ICreateDocument {
    TextEditor FrameLink;
    private final String[][] FILTERS = {{"txt", "Текстовые файлы (*.txt)"}};

    public CreateTextDocument(TextEditor frameLink) {
        FrameLink = frameLink;
    }

    @Override
    public IDocument createNew() {
        TextDocument td = new TextDocument(FrameLink);
        td.data = "";
        this.FrameLink.textArea.setText(td.data);
        this.FrameLink.textArea.revalidate();
        return td;
    }

    @Override
    public IDocument open() {
        TextDocument td = new TextDocument(FrameLink);
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileFilterExt eff = new FileFilterExt(FILTERS[0][0], FILTERS[0][1]);
        fc.addChoosableFileFilter(eff);
        if(fc.showOpenDialog(FrameLink.frame) == JFileChooser.APPROVE_OPTION)
        {
            try {
                File f = fc.getSelectedFile();
                FileReader fr = new FileReader(f);
                BufferedReader reader = new BufferedReader(fr);
                StringBuilder sb = new StringBuilder();
                String line = reader.readLine();
                while (line != null)
                {
                    sb.append(line).append('\n');
                    line = reader.readLine();
                }
                td.data = sb.toString();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Ошибка при чтении файла - будет создан новый файл",
                        "Ошибка",
                        JOptionPane.ERROR_MESSAGE
                );
                this.createNew();
            }
            this.FrameLink.textArea.setText(td.data);
            this.FrameLink.textArea.revalidate();
        }
        return td;
    }
}
