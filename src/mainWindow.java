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

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class mainWindow implements TableModelListener{

	private JFrame frame;
	JScrollPane scrollPane = new JScrollPane();

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
		frame.setBounds(100, 100, 2407, 977);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlText);
		
		ImageIcon image = new ImageIcon("C:/Users/draft/eclipse-workspace/OneSchool/src/kisspng-dashboard-business-intelligence-management-informa-dashboard-5adceebbd6e940.5844354015244284758803.jpg");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 2138, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 938, GroupLayout.PREFERRED_SIZE)
					.addGap(11))
		);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);

		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(scrollPane, Alignment.LEADING)
						.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblNewLabel_1 = new JLabel("Markbook");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1)
					.addContainerGap(1909, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(34)
					.addComponent(lblNewLabel_1)
					.addContainerGap(44, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		marksScreen.displayTable(scrollPane);
		panel_1.setLayout(gl_panel_1);
		
		
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollPane.setVisible(false);
				
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
				scrollPane.setVisible(true);
			}
		});
		btnMarkbook.setForeground(Color.WHITE);
		btnMarkbook.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnMarkbook.setFocusPainted(false);
		btnMarkbook.setBorder(emptyBorder);
		btnMarkbook.setBackground(Color.BLACK);
		
		JButton btnInventory = new JButton("Inventory");
		btnInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollPane.setVisible(false);
			}
		});
		btnInventory.setForeground(Color.WHITE);
		btnInventory.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnInventory.setFocusPainted(false);
		btnInventory.setBorder(emptyBorder);
		btnInventory.setBackground(Color.BLACK);
		
		JButton btnStats = new JButton("Stats");
		btnStats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollPane.setVisible(false);
			}
		});
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
							.addComponent(btnStats, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnInventory, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnMarkbook, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnDashboard, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(46)
							.addComponent(lblNewLabel)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(302)
					.addComponent(btnDashboard)
					.addGap(18)
					.addComponent(btnMarkbook, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnInventory, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnStats, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(415, Short.MAX_VALUE))
		);
		marksScreen.calculateMark(marksScreen.marks);
	    marksScreen.createTable(marksScreen.scrollpane);
	    SimpleTableDemo(marksScreen.table);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
	}
	
	public void SimpleTableDemo(JTable table) {
        table.getModel().addTableModelListener(this);
    }

	public void tableChanged(TableModelEvent e) {
		 int row = e.getFirstRow();
	     int column = e.getColumn();
	     TableModel model = (TableModel)e.getSource();
	     String columnName = model.getColumnName(column);
	     Object data = model.getValueAt(row, column);

	     System.out.println(columnName);
	     System.out.println(row);
	     System.out.println(column);
	     Arrays.deepToString(marksScreen.marks);
	     marksScreen.marks[row][column] = (String) data;
	     marksScreen.calculateMark(marksScreen.marks);
	     marksScreen.createTable(marksScreen.scrollpane);
	     SimpleTableDemo(marksScreen.table);
		
	}
}
