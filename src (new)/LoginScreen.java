import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginScreen {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen window = new LoginScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(298, 129, 294, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(406, 100, 67, 14);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(406, 160, 89, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblWelcomeToOneskool = new JLabel("Welcome to OneSkool ");
		lblWelcomeToOneskool.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWelcomeToOneskool.setBounds(345, 29, 220, 31);
		frame.getContentPane().add(lblWelcomeToOneskool);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogIn.setBounds(384, 244, 89, 23);
		frame.getContentPane().add(btnLogIn);
		
		JCheckBox chckbxKeepMeLogged = new JCheckBox("Keep me logged on");
		chckbxKeepMeLogged.setBounds(315, 214, 158, 23);
		frame.getContentPane().add(chckbxKeepMeLogged);
		
		JLabel lblDontHaveAn = new JLabel("Dont have an account?");
		lblDontHaveAn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDontHaveAn.setBounds(298, 307, 158, 14);
		frame.getContentPane().add(lblDontHaveAn);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(298, 185, 294, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnSignUp = new JButton("Sign Up!");
		btnSignUp.setBounds(466, 305, 89, 23);
		frame.getContentPane().add(btnSignUp);
	}
}
