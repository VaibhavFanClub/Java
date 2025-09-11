import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q1{
	private static int attemptsLeft = 3;
	public static void main(String[] args){
		JFrame frame = new JFrame("Login");
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));
		
		JLabel usernameLabel = new JLabel("Username:");
		JTextField usernameField = new JTextField(15);
		JLabel passwordLabel = new JLabel("Password:");
		JPasswordField passwordField = new JPasswordField(15);
		
		JButton loginButton = new JButton("Login");
		JButton resetButton = new JButton("Reset");
		
		panel.add(usernameLabel);
		panel.add(usernameField);
		panel.add(passwordLabel);
		panel.add(passwordField);
		panel.add(loginButton);
		panel.add(resetButton);
		
		frame.add(panel, BorderLayout.CENTER);
		
		String defaultUsername = "admin";
		String defaultPassword = "password";
		
		loginButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String username = usernameField.getText();
				String password = new String(passwordField.getPassword());
				if(attemptsLeft == 0){
					JOptionPane.showMessageDialog(frame, "Login failed");
					return;
				}
				if(defaultUsername.equals(username) && defaultPassword.equals(password)){
					JOptionPane.showMessageDialog(frame, "Login Successful");
					attemptsLeft = 3;
				}else{
					JOptionPane.showMessageDialog(frame, "Username and password is incorrect");
					attemptsLeft--;
				}
			}
		});
		
		resetButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				usernameField.setText("");
				passwordField.setText("");
			}
		});
		
		frame.setVisible(true);
	}
}
