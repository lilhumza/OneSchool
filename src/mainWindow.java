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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class mainWindow implements TableModelListener, ItemListener{

	private JFrame frame;
	JScrollPane SPMarkbook = new JScrollPane();
	JComboBox comboBox = new JComboBox();
	JLabel lblNewLabel_1 = new JLabel("Markbook");

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
		
		JPanel classXMarkbook = new JPanel();
		classXMarkbook.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(classXMarkbook, GroupLayout.PREFERRED_SIZE, 2138, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(classXMarkbook, GroupLayout.PREFERRED_SIZE, 938, GroupLayout.PREFERRED_SIZE)
					.addGap(11))
		);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);

		GroupLayout gl_classXMarkbook = new GroupLayout(classXMarkbook);
		gl_classXMarkbook.setHorizontalGroup(
			gl_classXMarkbook.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_classXMarkbook.createSequentialGroup()
					.addGroup(gl_classXMarkbook.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(SPMarkbook, Alignment.LEADING))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_classXMarkbook.setVerticalGroup(
			gl_classXMarkbook.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_classXMarkbook.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(SPMarkbook, GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
					.addContainerGap())
		);
		

		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		
		comboBox.setModel(new DefaultComboBoxModel(marksScreen.calsses));
		SimpleTableDemo1(comboBox);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1)
					.addContainerGap(1939, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(2039, Short.MAX_VALUE)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(32))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(34)
					.addComponent(lblNewLabel_1)
					.addGap(18)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		marksScreen.displayTable(SPMarkbook);
		classXMarkbook.setLayout(gl_classXMarkbook);
		
		
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				classXMarkbook.setVisible(false);
				
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
				classXMarkbook.setVisible(true);
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
				classXMarkbook.setVisible(false);
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
				classXMarkbook.setVisible(false);
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
	    marksScreen.createTable(marksScreen.SPMarkbook, marksScreen.marks, marksScreen.assignments);
	    SimpleTableDemo(marksScreen.table);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
	}
	
	public void SimpleTableDemo(JTable table) {
        table.getModel().addTableModelListener(this);
    }
	
	public void SimpleTableDemo1(JComboBox table) {
		comboBox.addItemListener(this);
    }

	public void tableChanged(TableModelEvent e) {
		 int row = e.getFirstRow();
	     int column = e.getColumn();
	     TableModel model = (TableModel)e.getSource();
	     String columnName = model.getColumnName(column);
	     Object data = model.getValueAt(row, column);

	     Arrays.deepToString(marksScreen.marks);
	     marksScreen.marks[row][column] = (String) data;
	     marksScreen.calculateMark(marksScreen.marks);
	     marksScreen.createTable(marksScreen.SPMarkbook, marksScreen.marks, marksScreen.assignments);
	     SimpleTableDemo(marksScreen.table);
		
	}
	public void itemStateChanged(ItemEvent e) 
    { 
        if (e.getSource() == comboBox) { 
  
        	lblNewLabel_1.setText((String) comboBox.getSelectedItem()); 
        } 
    } 
}
