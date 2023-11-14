package task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class WindowTemplate {
    boolean saved = false; //если файл сохранен, то true
    IDocument fileContent = null; //если файл открыт, то не равно нулю
    ICreateDocument fileCreator = null;
    JFrame frame;
    JMenuBar menuBar;
    JMenu menuFile;
    JMenuItem fileNew = new JMenuItem("Создать файл...");
    JMenuItem fileOpen = new JMenuItem("Открыть файл...");
    JMenuItem fileSave = new JMenuItem("Сохранить");
    JMenuItem fileExit = new JMenuItem("Выход");

    public WindowTemplate(String name) {
        frame = new JFrame(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(800, 600));

        menuBar = new JMenuBar();
        menuFile = new JMenu("Файл");
        menuFile.add(fileNew);
        menuFile.add(fileOpen);
        menuFile.add(fileSave);
        menuFile.add(fileExit);
        menuBar.add(menuFile);
        frame.setJMenuBar(menuBar);

        fileNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fileContent != null && !saved)
                    SaveFile(true);
                CreateFile();
            }
        });

        fileOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fileContent != null && !saved)
                    SaveFile(true);
                OpenFile();
            }
        });

        fileSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SaveFile(false);
            }
        });

        fileExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exit();
            }
        });

        frame.pack();
        frame.setVisible(true);
    }

    private void CreateFile() {
        fileContent = fileCreator.createNew();
        saved = false;
    }

    private void OpenFile() {
        fileContent = fileCreator.open();
        saved = false;
    }

    private void SaveFile(boolean confirm) {
        if (confirm)
        {
            int res = JOptionPane.showConfirmDialog(
                    null,
                    "Сохранить файл?",
                    "Сохранить?",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE
            );
            if (res == JOptionPane.YES_OPTION) {
                fileContent.save();
                saved = true;
            }
        }
        else
        {
            fileContent.save();
            saved = true;
        }
    }

    private void Exit() {
        if (fileContent != null && !saved)
            SaveFile(true);
        System.exit(0);
    }
}
