import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Component;
import java.awt.ComponentOrientation;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class dashBoard {

	private JFrame dashboardFrame;
	private JLabel lblWelcome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the application.
	 */
	public dashBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Create JFrame
		dashboardFrame = new JFrame();
		dashboardFrame.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		dashboardFrame.setBounds(100, 100, 1000, 500);
		dashboardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dashboardFrame.getContentPane().setLayout(null);
		
		//Create and design the NavBar area
		JPanel navPanel = new JPanel();
		navPanel.setBounds(0, 0, 160, 455);
		navPanel.setBackground(Color.DARK_GRAY);
		dashboardFrame.getContentPane().add(navPanel);
		navPanel.setLayout(null);
		
		//Menu label for NavBar
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(28, 3, 106, 57);
		lblMenu.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblMenu.setForeground(Color.WHITE);
		navPanel.add(lblMenu);
		
		//MarkBook Button on NavBar
		JButton btnMarkBook = new JButton("Mark Book");
		btnMarkBook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnMarkBook.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnMarkBook.setBounds(19, 156, 115, 29);
		navPanel.add(btnMarkBook);
		
		//GymInventory Button on NavBar
		JButton btnGymInventory = new JButton("GYM Inventory");
		btnGymInventory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnGymInventory.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnGymInventory.setBounds(18, 237, 115, 29);
		navPanel.add(btnGymInventory);
		
		//SncInventory Button on NavBar
		JButton btnScienceInventory = new JButton("SNC Inventory");
		btnScienceInventory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnScienceInventory.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnScienceInventory.setBounds(19, 321, 115, 29);
		navPanel.add(btnScienceInventory);
		
		//Attendance button on NavBar
		JButton btnAttendance = new JButton("Attendance");
		btnAttendance.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnAttendance.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnAttendance.setBounds(19, 76, 115, 29);
		navPanel.add(btnAttendance);
		
		//Log Out Button on NavBar
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnLogOut.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnLogOut.setBounds(19, 392, 115, 29);
		navPanel.add(btnLogOut);
		
		//Quick Stats - Attendance Metric
		JPanel attendancePanel = new JPanel();
		attendancePanel.setBounds(192, 250, 165, 165);
		attendancePanel.setBackground(Color.LIGHT_GRAY);
		dashboardFrame.getContentPane().add(attendancePanel);
		attendancePanel.setLayout(null);
		
		//Attendance Metric Label
		JLabel lblAttendance = new JLabel("16/29");
		lblAttendance.setHorizontalAlignment(SwingConstants.CENTER);
		lblAttendance.setBounds(0, 0, 165, 165);
		lblAttendance.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		attendancePanel.add(lblAttendance);
		
		//Present Label
		JLabel lblPresent = new JLabel("Present");
		lblPresent.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPresent.setHorizontalAlignment(SwingConstants.CENTER);
		lblPresent.setBounds(25, 129, 125, 20);
		attendancePanel.add(lblPresent);
		
		//Quick Stats - Gym Inventory
		JPanel gymPanel = new JPanel();
		gymPanel.setBounds(390, 250, 165, 165);
		gymPanel.setBackground(Color.GRAY);
		dashboardFrame.getContentPane().add(gymPanel);
		gymPanel.setLayout(null);
		
		//Gym Equipment Metric Label
		JLabel lblGymLabel = new JLabel("17/32");
		lblGymLabel.setBounds(0, 0, 165, 165);
		lblGymLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblGymLabel.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		gymPanel.add(lblGymLabel);
		
		//Gym Equipment Label
		JLabel lblGymEquip = new JLabel("GYM Equipment");
		lblGymEquip.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblGymEquip.setBounds(15, 129, 135, 20);
		gymPanel.add(lblGymEquip);
		
		//Quick Stats - SNC Inventory
		JPanel sncPanel = new JPanel();
		sncPanel.setBounds(582, 250, 165, 165);
		sncPanel.setBackground(Color.DARK_GRAY);
		dashboardFrame.getContentPane().add(sncPanel);
		sncPanel.setLayout(null);
		
		//SNC Equipment Metric Label
		JLabel lblSncLabel = new JLabel("ZERO");
		lblSncLabel.setBounds(0, 0, 165, 165);
		lblSncLabel.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblSncLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sncPanel.add(lblSncLabel);
		
		//SNC Equipment Label
		JLabel lblSncEquipment = new JLabel("SNC Equipment");
		lblSncEquipment.setHorizontalAlignment(SwingConstants.CENTER);
		lblSncEquipment.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblSncEquipment.setBounds(15, 129, 135, 20);
		sncPanel.add(lblSncEquipment);
		
		//Quick Stats - Date & Time
		JPanel datePanel = new JPanel();
		datePanel.setBounds(776, 250, 165, 165);
		datePanel.setBackground(Color.BLACK);
		dashboardFrame.getContentPane().add(datePanel);
		datePanel.setLayout(null);
		
		//Date Label
		JLabel lblDate = new JLabel("10 DEC");
		lblDate.setBounds(0, 0, 165, 165);
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblDate.setForeground(Color.WHITE);
		datePanel.add(lblDate);
		
		//Time Label
		JLabel lblTime = new JLabel("1:42 PM");
		lblTime.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblTime.setForeground(Color.WHITE);
		lblTime.setBounds(51, 129, 69, 20);
		datePanel.add(lblTime);
		
		//Welcome Label
		lblWelcome = new JLabel("Welcome to OneSchool");
		lblWelcome.setBounds(192, 45, 300, 45);
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBackground(Color.DARK_GRAY);
		dashboardFrame.getContentPane().add(lblWelcome);
		
		//Welcome Section TextArea
		JTextArea txtrWelcome = new JTextArea();
		txtrWelcome.setBackground(Color.WHITE);
		txtrWelcome.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtrWelcome.setLineWrap(true);
		txtrWelcome.setWrapStyleWord(true);
		txtrWelcome.setText("OneSchool is an intuituve solution for teachers to quickly access and manage related items to students in their respective classes. Included options are Attendance, Markbook and Inventories for the GYM and Science Depts. ");
		txtrWelcome.setBounds(192, 94, 363, 140);
		dashboardFrame.getContentPane().add(txtrWelcome);
		
		//Private Notes TextArea
		JTextArea txtrPrivateNotes = new JTextArea();
		txtrPrivateNotes.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtrPrivateNotes.setLineWrap(true);
		txtrPrivateNotes.setText("Private Notes: ");
		txtrPrivateNotes.setBounds(582, 45, 359, 190);
		dashboardFrame.getContentPane().add(txtrPrivateNotes);
	}
}
