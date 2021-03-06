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
import java.io.IOException;
import javax.swing.JPasswordField;
//Creates the log in screen
public class LoginScreen {

	public static JFrame loginScreen = new JFrame(); //Jfreame setup and declaration
	public static JTextField username;
	public static JPasswordField password;
	public static LoginScreen window;

	static {
		try {
			window = new LoginScreen();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window.loginScreen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginScreen() throws Exception {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	//Displays the log in screen 
	private void initialize() throws Exception{
		loginScreen.setBounds(100, 100, 1000, 500);
		loginScreen.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		loginScreen.getContentPane().setLayout(null);

		username = new JTextField();
		username.setBounds(298, 129, 294, 20);
		loginScreen.getContentPane().add(username);
		username.setColumns(10);

		password = new JPasswordField();
		password.setBounds(298, 185, 294, 20);
		loginScreen.getContentPane().add(password);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(406, 100, 67, 14);
		loginScreen.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(406, 160, 89, 14);
		loginScreen.getContentPane().add(lblPassword);
		
		JLabel lblWelcomeToOneskool = new JLabel("Welcome to OneSkool ");
		lblWelcomeToOneskool.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWelcomeToOneskool.setBounds(345, 29, 220, 31);
		loginScreen.getContentPane().add(lblWelcomeToOneskool);

		//Links the log in screen to the dashboard once you sign in 
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLogIn.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				boolean verified = false;
				try {
					verified = verifyUser.verify(username.getText(), password.getText());
				} catch (IOException e) {
					e.printStackTrace();
				}
				if(verified){
					loginScreen.setVisible(false);
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								dashBoard window = new dashBoard();
								window.dashboardFrame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				else {
					System.out.println("Wrong Password or Username");
				}
			}
		});
		btnLogIn.setBounds(384, 244, 89, 23);
		loginScreen.getContentPane().add(btnLogIn);
	
		JLabel lblDontHaveAn = new JLabel("Dont have an account?");
		lblDontHaveAn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDontHaveAn.setBounds(298, 307, 158, 14);
		loginScreen.getContentPane().add(lblDontHaveAn);
		
		//When clicked a screen will pop up to create an account	
		JButton btnSignUp = new JButton("Sign Up!");
		btnSignUp.setBounds(466, 305, 89, 23);
		loginScreen.getContentPane().add(btnSignUp);
		btnSignUp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							SignUp newAcc = new SignUp();
							SignUp.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		
}
}
