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

	JFrame frame1;
	private JLabel lblWelcome;

	/**
	 * Launch the application.
	 */

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
		frame1 = new JFrame();
		frame1.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		frame1.setBounds(100, 100, 1000, 500);
		frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JPanel navPanel = new JPanel();
		navPanel.setBounds(0, 0, 160, 455);
		navPanel.setBackground(Color.DARK_GRAY);
		frame1.getContentPane().add(navPanel);
		navPanel.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(28, 3, 106, 57);
		lblMenu.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblMenu.setForeground(Color.WHITE);
		navPanel.add(lblMenu);
		
		JButton btnMarkBook = new JButton("Mark Book");
		btnMarkBook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnMarkBook.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnMarkBook.setBounds(19, 156, 115, 29);
		navPanel.add(btnMarkBook);
		
		JButton btnGymInventory = new JButton("GYM Inventory");
		btnGymInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							markbook markbookw = new markbook();
							markbookw.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnGymInventory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnGymInventory.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnGymInventory.setBounds(18, 237, 115, 29);
		navPanel.add(btnGymInventory);
		
		JButton btnScienceInventory = new JButton("SNC Inventory");
		btnScienceInventory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnScienceInventory.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnScienceInventory.setBounds(19, 321, 115, 29);
		navPanel.add(btnScienceInventory);
		
		JButton btnAttendance = new JButton("Attendance");
		btnAttendance.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnAttendance.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnAttendance.setBounds(19, 76, 115, 29);
		navPanel.add(btnAttendance);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnLogOut.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnLogOut.setBounds(19, 392, 115, 29);
		navPanel.add(btnLogOut);
		
		JPanel attendancePanel = new JPanel();
		attendancePanel.setBounds(192, 250, 165, 165);
		attendancePanel.setBackground(Color.LIGHT_GRAY);
		frame1.getContentPane().add(attendancePanel);
		attendancePanel.setLayout(null);
		
		JLabel label = new JLabel("16/29");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 0, 165, 165);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		attendancePanel.add(label);
		
		JLabel lblPresent = new JLabel("Present");
		lblPresent.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPresent.setHorizontalAlignment(SwingConstants.CENTER);
		lblPresent.setBounds(25, 129, 125, 20);
		attendancePanel.add(lblPresent);
		
		JPanel gymPanel = new JPanel();
		gymPanel.setBounds(390, 250, 165, 165);
		gymPanel.setBackground(Color.GRAY);
		frame1.getContentPane().add(gymPanel);
		gymPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("17/32");
		lblNewLabel.setBounds(0, 0, 165, 165);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		gymPanel.add(lblNewLabel);
		
		JLabel lblGymEquip = new JLabel("GYM Equipment");
		lblGymEquip.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblGymEquip.setBounds(15, 129, 135, 20);
		gymPanel.add(lblGymEquip);
		
		JPanel sncPanel = new JPanel();
		sncPanel.setBounds(582, 250, 165, 165);
		sncPanel.setBackground(Color.DARK_GRAY);
		frame1.getContentPane().add(sncPanel);
		sncPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ZERO");
		lblNewLabel_1.setBounds(0, 0, 165, 165);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		sncPanel.add(lblNewLabel_1);
		
		JLabel lblSncEquipment = new JLabel("SNC Equipment");
		lblSncEquipment.setHorizontalAlignment(SwingConstants.CENTER);
		lblSncEquipment.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblSncEquipment.setBounds(15, 129, 135, 20);
		sncPanel.add(lblSncEquipment);
		
		JPanel datePanel = new JPanel();
		datePanel.setBounds(776, 250, 165, 165);
		datePanel.setBackground(Color.BLACK);
		frame1.getContentPane().add(datePanel);
		datePanel.setLayout(null);
		
		JLabel lblDec = new JLabel("10 DEC");
		lblDec.setBounds(0, 0, 165, 165);
		lblDec.setHorizontalAlignment(SwingConstants.CENTER);
		lblDec.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblDec.setForeground(Color.WHITE);
		datePanel.add(lblDec);
		
		JLabel lblPm = new JLabel("1:42 PM");
		lblPm.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPm.setForeground(Color.WHITE);
		lblPm.setBounds(51, 129, 69, 20);
		datePanel.add(lblPm);
		//txtPrivateNotes.setColumns(10);
		
		lblWelcome = new JLabel("Welcome to OneSchool");
		lblWelcome.setBounds(192, 45, 300, 45);
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBackground(Color.DARK_GRAY);
		frame1.getContentPane().add(lblWelcome);
		
		JTextArea txtrWelcome = new JTextArea();
		txtrWelcome.setBackground(Color.WHITE);
		txtrWelcome.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtrWelcome.setLineWrap(true);
		txtrWelcome.setWrapStyleWord(true);
		txtrWelcome.setText("OneSchool is an intuituve solution for teachers to quickly access and manage related items to students in their respective classes. Included options are Attendance, Markbook and Inventories for the GYM and Science Depts. ");
		txtrWelcome.setBounds(192, 94, 363, 140);
		frame1.getContentPane().add(txtrWelcome);
		
		JTextArea txtrPrivateNotes = new JTextArea();
		txtrPrivateNotes.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtrPrivateNotes.setLineWrap(true);
		txtrPrivateNotes.setText("Private Notes: ");
		txtrPrivateNotes.setBounds(582, 45, 359, 190);
		frame1.getContentPane().add(txtrPrivateNotes);
	}
}
