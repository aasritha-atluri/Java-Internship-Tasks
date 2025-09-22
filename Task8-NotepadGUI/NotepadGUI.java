import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class NotepadGUI extends JFrame {
    JTextArea textArea;
    JFileChooser fileChooser;

    public NotepadGUI() {
        setTitle("Notepad");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textArea = new JTextArea();
        fileChooser = new JFileChooser();

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");

        openItem.addActionListener(e -> openFile());
        saveItem.addActionListener(e -> saveFile());

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        menuBar.add(fileMenu);

        setJMenuBar(menuBar);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        setVisible(true);
    }

    private void openFile() {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try (BufferedReader br = new BufferedReader(new FileReader(fileChooser.getSelectedFile()))) {
                textArea.read(br, null);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void saveFile() {
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile()))) {
                textArea.write(bw);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(NotepadGUI::new);
    }
}
