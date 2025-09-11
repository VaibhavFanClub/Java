import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temp {
    public static void main(String[] args) {
        // Main frame setup
        JFrame frame = new JFrame("Vaccination Details");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));

        // Main panel setup with GridLayout for the overall structure
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Panel 1: Name input (adds margin and spacing)
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10)); // Horizontal and vertical gap
        panel1.add(new JLabel("Name:"));
        JTextField nameField = new JTextField(20);
        panel1.add(nameField);
        mainPanel.add(panel1);

        // Panel 2: Dose selection (adds margin and spacing)
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3, 1, 0, 15)); // Row gap of 15 for better spacing
        panel2.add(new JLabel("Select Dose:"));
        JCheckBox dose1 = new JCheckBox("1st Dose");
        panel2.add(dose1);
        JCheckBox dose2 = new JCheckBox("2nd Dose");
        panel2.add(dose2);
        mainPanel.add(panel2);

        // Panel 3: Vaccine selection (adds margin and spacing)
        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(4, 1, 0, 10)); // Row gap of 10 for better spacing
        panel3.add(new JLabel("Select Vaccine:"));
        JRadioButton covishield = new JRadioButton("Covishield");
        panel3.add(covishield);
        JRadioButton covaxin = new JRadioButton("Covaxin");
        panel3.add(covaxin);
        JRadioButton sputnik = new JRadioButton("Sputnik V");
        panel3.add(sputnik);

        // Group the radio buttons
        ButtonGroup vaccineGroup = new ButtonGroup();
        vaccineGroup.add(covishield);
        vaccineGroup.add(covaxin);
        vaccineGroup.add(sputnik);
        mainPanel.add(panel3);

        // Panel 4: Display selected details with improved margins
        JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayout(4, 2, 10, 10)); // Horizontal and vertical gap of 10
        panel4.setBorder(BorderFactory.createTitledBorder("Vaccination Summary"));

        // Labels to show input details
        panel4.add(new JLabel("Name:"));
        JLabel nameLabel = new JLabel();
        panel4.add(nameLabel);
        panel4.add(new JLabel("1st Dose:"));
        JLabel dose1Label = new JLabel();
        panel4.add(dose1Label);
        panel4.add(new JLabel("2nd Dose:"));
        JLabel dose2Label = new JLabel();
        panel4.add(dose2Label);
        panel4.add(new JLabel("Vaccine:"));
        JLabel vaccineLabel = new JLabel();
        panel4.add(vaccineLabel);

        mainPanel.add(panel4);

        // Add main panel to the frame
        frame.add(mainPanel, BorderLayout.CENTER);

        // Action Listeners to update labels based on user input
        nameField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String enteredText = nameField.getText();
                nameLabel.setText(enteredText);
            }
        });

        dose1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dose1Label.setText(dose1.isSelected() ? "Taken" : "Not Taken");
            }
        });

        dose2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dose2Label.setText(dose2.isSelected() ? "Taken" : "Not Taken");
            }
        });

        covishield.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                vaccineLabel.setText("Covishield");
            }
        });

        covaxin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                vaccineLabel.setText("Covaxin");
            }
        });

        sputnik.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                vaccineLabel.setText("Sputnik V");
            }
        });

        // Make frame visible
        frame.setVisible(true);
    }
}

