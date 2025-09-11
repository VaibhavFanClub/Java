import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2{
	public static void main(String[] args){
		JFrame frame = new JFrame("Vaccination");
		frame.setSize(600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(3, 0));
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridBagLayout());
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		panel1.add(new JLabel("Vaccination Details"), gbc);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		panel1.add(new JLabel("Name: "), gbc);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		JTextField nameField = new JTextField(15);
		panel1.add(nameField , gbc);
		
		mainPanel.add(panel1);
		
		JPanel panelSub = new JPanel();
		panelSub.setLayout(new GridLayout(1, 2));
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(3, 0));
		panel2.add(new JLabel("Dose"));
		JCheckBox dose1 = new JCheckBox("1st Dose");
		panel2.add(dose1);
		JCheckBox dose2 = new JCheckBox("2nd Dose");
		panel2.add(dose2);
		
		panelSub.add(panel2);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(4, 0));
		panel3.add(new JLabel("Vaccine"));
		JRadioButton covishield = new JRadioButton("Covishield");
		panel3.add(covishield);
		JRadioButton covaxin = new JRadioButton("Covaxin");
		panel3.add(covaxin);
		JRadioButton sputnik = new JRadioButton("Sputnik V");
		panel3.add(sputnik);
		ButtonGroup vaccineGroup = new ButtonGroup();
		vaccineGroup.add(covishield);
		vaccineGroup.add(covaxin);
		vaccineGroup.add(sputnik);
		
		panelSub.add(panel3);

		mainPanel.add(panelSub);
		
		JPanel panel4 = new JPanel();
		panel4.setBorder(BorderFactory.createTitledBorder(""));
		panel4.setLayout(new GridLayout(2, 6));
		panel4.add(new JLabel("Name:"));
		JLabel nameLabel = new JLabel();
		panel4.add(nameLabel);
		panel4.add(new JLabel("1st Dose:"));
		JLabel dose1Label = new JLabel("No");
		panel4.add(dose1Label);
		panel4.add(new JLabel("2nd Dose:"));
		JLabel dose2Label = new JLabel("No");
		panel4.add(dose2Label);
		panel4.add(new JLabel("Vaccine:"));
		JLabel vaccineLabel = new JLabel();
		panel4.add(vaccineLabel);

		mainPanel.add(panel4);
		
		frame.add(mainPanel, BorderLayout.CENTER);
		
		nameField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    String enteredText = nameField.getText();
			    nameLabel.setText(enteredText);
			}
		});
		
		dose1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    dose1Label.setText("Yes");
			}
		});
		
		dose2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    dose2Label.setText("Yes");
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
			    vaccineLabel.setText("Sputnik");
			}
		});
		
		frame.setVisible(true);
	}
}
