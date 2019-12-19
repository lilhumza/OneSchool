import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JPasswordField;

public class SignUp {

	static JFrame frame;
	private JTextField textField;
	private JLabel lblCreateAnAccount;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
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
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1004, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblDesiredUserName = new JLabel("Desired User Name");
		
		JLabel lblDesiredPassword = new JLabel("Desired Password");
		
		lblCreateAnAccount = new JLabel("Create an account for FREE!");
		lblCreateAnAccount.setFont(new Font("Tahoma", Font.PLAIN, 19));
		

		    
		JButton btnCreateAccount = new JButton("Create account");
		
		
			
		
		passwordField = new JPasswordField();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(437)
					.addComponent(lblDesiredUserName)
					.addContainerGap(460, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(439)
					.addComponent(lblDesiredPassword)
					.addContainerGap(464, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(369)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(passwordField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
						.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
						.addComponent(lblCreateAnAccount, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(381))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(427)
					.addComponent(btnCreateAccount)
					.addContainerGap(454, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(68)
					.addComponent(lblCreateAnAccount)
					.addGap(49)
					.addComponent(lblDesiredUserName)
					.addGap(18)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(lblDesiredPassword)
					.addGap(18)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnCreateAccount)
					.addContainerGap(148, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	}
