  
import java.awt.EventQueue;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Component;
import java.awt.ComponentOrientation;
import javax.swing.border.Border;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dashBoard {

	JFrame dashboardFrame;
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
	 * Initialize the contents of the dashboardFrame.
	 */
	private void initialize() {
		
		
		String gymInv = "", sncInv = "";
		
		try {
	        	FileReader data = new FileReader("metrics.txt");
	        	BufferedReader readData = new BufferedReader(data);
	       
	        	gymInv = readData.readLine();
	        	sncInv = readData.readLine();
	        
	        	readData.close();
	        	data.close();
	        	System.out.println("Data written to file.");
	      	} catch (IOException e) {
	        	System.out.println("Problem writing to file.");
	       		System.err.println("IOException: " + e.getMessage());
	     	}
		
		//JFrame declaration and setup
		dashboardFrame = new JFrame();
		dashboardFrame.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		dashboardFrame.setBounds(100, 100, 1000, 500);
		dashboardFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		dashboardFrame.getContentPane().setLayout(null);
		
		//JPanel for NavBar declaration and setup
		JPanel navPanel = new JPanel();
		navPanel.setBounds(0, 0, 160, 455);
		navPanel.setBackground(Color.DARK_GRAY);
		dashboardFrame.getContentPane().add(navPanel);
		navPanel.setLayout(null);
		
		//JLabel for navBar Title declaration and setup
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(19, 0, 106, 57);
		lblMenu.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblMenu.setForeground(Color.WHITE);
		navPanel.add(lblMenu);
		
		//JButton for navBar MarkBook button declaration and setup
		JButton btnMarkBook = new JButton("Mark Book");
		btnMarkBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMarkBook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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
		btnMarkBook.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnMarkBook.setBounds(19, 182, 115, 29);
		navPanel.add(btnMarkBook);
		btnMarkBook.setForeground(Color.WHITE);
		btnMarkBook.setBackground(Color.DARK_GRAY);
		Border emptyBorder = BorderFactory.createEmptyBorder();
		btnMarkBook.setBorder(emptyBorder);
		btnMarkBook.setFocusPainted(false);
		
		//JButton for navBar Log Out button declaration and setup
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnLogOut.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnLogOut.setBounds(19, 392, 115, 29);
		navPanel.add(btnLogOut);
		btnLogOut.setForeground(Color.WHITE);
		btnLogOut.setBackground(Color.DARK_GRAY);
		btnLogOut.setBorder(emptyBorder);
		btnLogOut.setFocusPainted(false);
		
		JButton btnInventory = new JButton("Inventory");
		btnInventory.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Inventory InventoryWindow = new Inventory();
							InventoryWindow.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnInventory.setForeground(Color.WHITE);
		btnInventory.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnInventory.setFocusPainted(false);
		btnInventory.setBackground(Color.DARK_GRAY);
		btnInventory.setBounds(19, 222, 115, 29);
		navPanel.add(btnInventory);
		
		//Quick Stats - Gym Inventory
		JPanel gymPanel = new JPanel();
		gymPanel.setBounds(390, 250, 165, 165);
		gymPanel.setBackground(Color.GRAY);
		dashboardFrame.getContentPane().add(gymPanel);
		gymPanel.setLayout(null);
		
		//Gym Equipment Metric Label
		JLabel lblGymLabel = new JLabel("3/3");
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
		JLabel lblSncLabel = new JLabel("3/3");
		lblSncLabel.setBounds(0, 0, 165, 165);
		lblSncLabel.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblSncLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblSncLabel.setForeground(Color.white);
		sncPanel.add(lblSncLabel);
		
		//SNC Equipment Label
		JLabel lblSncEquipment = new JLabel("SNC Equipment");
		lblSncEquipment.setHorizontalAlignment(SwingConstants.CENTER);
		lblSncEquipment.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblSncEquipment.setBounds(15, 129, 135, 20);
		lblSncEquipment.setForeground(Color.white);
		sncPanel.add(lblSncEquipment);
		
		//Quick Stats - Date & Time
		JPanel datePanel = new JPanel();
		datePanel.setBounds(776, 250, 165, 165);
		datePanel.setBackground(Color.BLACK);
		dashboardFrame.getContentPane().add(datePanel);
		datePanel.setLayout(null);
		
		
		Date date = new Date();
	   	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
	    	String day = simpleDateFormat.format(date);
	    	simpleDateFormat = new SimpleDateFormat("MMM");
	    	String month = simpleDateFormat.format(date).toUpperCase();
	    	String outPut = day +" "+ month;
		
		//Date Label
		JLabel lblDate = new JLabel(outPut);
		lblDate.setBounds(0, 0, 165, 165);
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblDate.setForeground(Color.WHITE);
		datePanel.add(lblDate);
		
		//Time Label
		JLabel lblTime = new JLabel();
		lblTime.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblTime.setForeground(Color.WHITE);
		lblTime.setBounds(51, 129, 90, 20);
		datePanel.add(lblTime);
		
		Timer SimpleTimer = new Timer(45, new ActionListener(){
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	SimpleDateFormat formatDate = new SimpleDateFormat("h:mm a");
			    String dateString = formatDate.format(new Date()).toString();
				lblTime.setText(dateString);
		    }
		});
		SimpleTimer.start();	
		
		//Welcome Label
		lblWelcome = new JLabel("Welcome to OneSchool");
		lblWelcome.setBounds(186, 0, 300, 45);
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
		txtrWelcome.setBounds(192, 45, 363, 194);
		txtrWelcome.setEditable(false);
		dashboardFrame.getContentPane().add(txtrWelcome);
		
		//Private Notes TextArea
		JTextArea txtrPrivateNotes = new JTextArea();
		txtrPrivateNotes.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtrPrivateNotes.setLineWrap(true);
		txtrPrivateNotes.setText("Private Notes: ");
		txtrPrivateNotes.setBounds(582, 45, 359, 190);
		dashboardFrame.getContentPane().add(txtrPrivateNotes);
		
		JLabel lblCB = new JLabel("Chrome Books");
		lblCB.setHorizontalAlignment(SwingConstants.CENTER);
		lblCB.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCB.setBounds(20, 134, 135, 20);
		lblCB.setForeground(Color.white);
		CBPanel.add(lblCB);
		
	}
}
