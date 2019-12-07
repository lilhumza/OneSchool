import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.border.Border;

import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow window = new mainWindow();
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
	public mainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Tree.background"));
		frame.setBounds(100, 100, 2142, 977);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlText);
		
		ImageIcon image = new ImageIcon("C:/Users/draft/eclipse-workspace/OneSchool/src/kisspng-dashboard-business-intelligence-management-informa-dashboard-5adceebbd6e940.5844354015244284758803.jpg");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1854, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
		);
		
		
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnDashboard.setForeground(Color.WHITE);
		btnDashboard.setBackground(Color.BLACK);
		btnDashboard.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		Border emptyBorder = BorderFactory.createEmptyBorder();
		btnDashboard.setBorder(emptyBorder);
		btnDashboard.setFocusPainted(false);
		
		JButton btnMarkbook = new JButton("Markbook");
		btnMarkbook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = marksScreen.initialize1();
			}
		});
		btnMarkbook.setForeground(Color.WHITE);
		btnMarkbook.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnMarkbook.setFocusPainted(false);
		btnMarkbook.setBorder(emptyBorder);
		btnMarkbook.setBackground(Color.BLACK);
		
		JButton btnInventory = new JButton("Inventory");
		btnInventory.setForeground(Color.WHITE);
		btnInventory.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnInventory.setFocusPainted(false);
		btnInventory.setBorder(emptyBorder);
		btnInventory.setBackground(Color.BLACK);
		
		JButton btnStats = new JButton("Stats");
		btnStats.setForeground(Color.WHITE);
		btnStats.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnStats.setFocusPainted(false);
		btnStats.setBackground(Color.BLACK);
		btnStats.setBorder(emptyBorder);
		
		JLabel lblNewLabel = new JLabel("OneSchool");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setForeground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnDashboard, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(40)
							.addComponent(lblNewLabel))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnInventory, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnMarkbook, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnStats, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(180)
					.addComponent(btnDashboard)
					.addGap(18)
					.addComponent(btnMarkbook, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnInventory, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnStats, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(526, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
	}
}
