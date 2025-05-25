import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.regex.*;

public class ResumeHighlighterGUI extends JFrame {
    private JTextArea textArea;
    private JButton loadButton;
    private JTextField keywordField;

    // Default keywords
    private String[] defaultKeywords = {
        "Java", "Python", "SQL", "Spring Boot", "Docker", "AWS", "RESTful APIs", "JavaScript", "Kotlin"
    };

    public ResumeHighlighterGUI() {
        setTitle("Resume Keyword Highlighter");
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        loadButton = new JButton("Load Resume (.txt)");
        keywordField = new JTextField(String.join(", ", defaultKeywords), 40);

        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Keywords (comma-separated):"));
        topPanel.add(keywordField);
        topPanel.add(loadButton);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        loadButton.addActionListener(e -> loadAndHighlightResume());

        setVisible(true);
    }

    private void loadAndHighlightResume() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File resumeFile = fileChooser.getSelectedFile();
            String keywordsText = keywordField.getText();
            String[] keywords = keywordsText.split("\\s*,\\s*"); // split by comma

            try {
                textArea.setText("");
                String resumeContent = new String(java.nio.file.Files.readAllBytes(resumeFile.toPath()));
                textArea.setText(resumeContent);

                highlightKeywords(resumeContent, keywords);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Failed to read file: " + ex.getMessage());
            }
        }
    }

    private void highlightKeywords(String content, String[] keywords) {
        Highlighter highlighter = textArea.getHighlighter();
        highlighter.removeAllHighlights();

        for (String keyword : keywords) {
            Pattern pattern = Pattern.compile("\\b" + Pattern.quote(keyword) + "\\b", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(content);

            while (matcher.find()) {
                try {
                    highlighter.addHighlight(
                        matcher.start(),
                        matcher.end(),
                        new DefaultHighlighter.DefaultHighlightPainter(Color.YELLOW)
                    );
                } catch (BadLocationException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ResumeHighlighterGUI::new);
    }
}
