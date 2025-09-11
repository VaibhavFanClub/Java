import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Q3 {
    private static JTextArea textArea;
    private static JLabel wordLabel;
    private static JLabel charLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Word and Character Counter");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null); 
        frame.add(panel);

        wordLabel = new JLabel("Words: 0");
        wordLabel.setBounds(50, 20, 120, 25);
        panel.add(wordLabel);

        charLabel = new JLabel("Characters: 0");
        charLabel.setBounds(200, 20, 150, 25);
        panel.add(charLabel);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(50, 50, 300, 100);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(scrollPane);

        JButton countButton = new JButton("Count Words"); 
        countButton.setBounds(140, 170, 120, 30);
        panel.add(countButton);

        countButton.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();

                String[] words = text.trim().split("\\s+");
                int wordCount = text.trim().isEmpty() ? 0 : words.length;
                int charCount = text.length();

                wordLabel.setText("Words: " + wordCount);
                charLabel.setText("Characters: " + charCount);
            }
        });

        frame.setVisible(true);
    }
}

