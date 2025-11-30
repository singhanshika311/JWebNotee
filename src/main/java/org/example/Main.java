package org.example;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Main extends JFrame {
    private JTextArea textArea;

    public Main() {
        setTitle("CheerpJ Notes App");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");

        JMenuItem save = new JMenuItem("Save Note");
        save.addActionListener(e -> saveNote());

        JMenuItem load = new JMenuItem("Load Note");
        load.addActionListener(e -> loadNote());

        file.add(save);
        file.add(load);
        menuBar.add(file);
        setJMenuBar(menuBar);
    }

    private void saveNote() {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            try (FileWriter fw = new FileWriter(chooser.getSelectedFile())) {
                fw.write(textArea.getText());
                JOptionPane.showMessageDialog(this, "Saved Successfully!");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private void loadNote() {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try (BufferedReader br = new BufferedReader(new FileReader(chooser.getSelectedFile()))) {
                textArea.read(br, null);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}
