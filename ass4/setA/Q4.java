import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q4{
      
      private static JComboBox<String> languageComboBox;
      private static JLabel displayLabel;
      
      public static void main(String[] args){
            JFrame frame = new JFrame("Language Selector");
            
            frame.setSize(500,500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JPanel panel = new JPanel();
            frame.add(panel);
            placeComponents(panel);
            
            frame.setVisible(true);
      }
      
      private static void placeComponents(JPanel panel){
            panel.setLayout(null);
            
            JLabel selectLabel = new JLabel("Select Language");
            selectLabel.setBounds(10,20,120,25);
            panel.add(selectLabel);
            
            String[] languages = {"C","C++","java","Python","R"};
            languageComboBox = new JComboBox<>(languages);
            languageComboBox.setBounds(140,20,120,25);
            panel.add(languageComboBox);
            
            JButton showButton = new JButton("show");
            showButton.setBounds(10,60,80,25);
            panel.add(showButton);
            
            displayLabel= new JLabel("");
            displayLabel.setBounds(10,100,250,25);
            panel.add(displayLabel);
            
            showButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){	    
			    String selectedLanguage = (String) languageComboBox.getSelectedItem();
	      
			    displayLabel.setText("Selected Language: " + selectedLanguage);
			}
		});
	}
}
