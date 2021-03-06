import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;

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

public class markbook implements TableModelListener, ItemListener{

	JFrame frame;
	JScrollPane SPMarkbook = new JScrollPane();
	JComboBox comboBox = new JComboBox();
	JLabel MarkBookTitle = new JLabel("");
	
	public markbook() {
		initialize();
	}

	//method that makes a layout for a markbook table, including adding fonts and colors
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Tree.background"));
		frame.setBounds(100,100,1000,500);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
		MarkBookTitle.setText(marksTable.calsses[0]);
		
		JPanel classXMarkbook = new JPanel();
		classXMarkbook.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(classXMarkbook, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 2148, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(classXMarkbook, GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);

		GroupLayout gl_classXMarkbook = new GroupLayout(classXMarkbook);
		gl_classXMarkbook.setHorizontalGroup(
			gl_classXMarkbook.createParallelGroup(Alignment.LEADING)
				.addComponent(SPMarkbook, GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
		);
		gl_classXMarkbook.setVerticalGroup(
			gl_classXMarkbook.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_classXMarkbook.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(SPMarkbook, GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		MarkBookTitle.setFont(new Font("Times New Roman", Font.BOLD, 20));
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 9));
		
		comboBox.setModel(new DefaultComboBoxModel(marksTable.calsses));
		detectCBChanges(comboBox);
		
		JButton button = new JButton("New Coloum");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InventoryTable.headers = resizeArray.addOneColoum(InventoryTable.headers);
				InventoryTable.createTable(InventoryTable.SPMarkbook, InventoryTable.inventoryData, InventoryTable.headers);
			}
		});
		
		JButton button_1 = new JButton("New Row");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(MarkBookTitle)
					.addPreferredGap(ComponentPlacement.RELATED, 576, Short.MAX_VALUE)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addGap(68)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(MarkBookTitle)
						.addComponent(button)
						.addComponent(button_1))
					.addContainerGap(17, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(31, Short.MAX_VALUE)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		marksTable.displayTable(SPMarkbook);
		classXMarkbook.setLayout(gl_classXMarkbook);
		Border emptyBorder = BorderFactory.createEmptyBorder();
		marksTable.calculateMark(marksTable.marks);
		marksTable.createTable(marksTable.SPMarkbook, marksTable.marks, marksTable.assignments);
	    SimpleTableDemo(marksTable.table);
		frame.getContentPane().setLayout(groupLayout);
	}
	
	//method that creates a table listener that reacts when there is a change made to the table
	public void SimpleTableDemo(JTable table) {
        table.getModel().addTableModelListener(this);
    }
	//method that creates a item listener that reacts when there is a change made to the combobox
	public void detectCBChanges(JComboBox table) {
		comboBox.addItemListener(this);
    }
	//tableChanged is activated when there is a change in the table, it gets the new changed mark and 
	//recalculates the average and adds it to the Calculated Marks coloum
	public void tableChanged(TableModelEvent e) {
		 int row = e.getFirstRow();
	     int column = e.getColumn();
	     TableModel model = (TableModel)e.getSource();
	     String columnName = model.getColumnName(column);
	     Object data = model.getValueAt(row, column);

	     Arrays.deepToString(marksTable.marks);
	     marksTable.marks[row][column] = (String) data;
	     marksTable.calculateMark(marksTable.marks);
	     marksTable.createTable(marksTable.SPMarkbook, marksTable.marks, marksTable.assignments);
	     SimpleTableDemo(marksTable.table);
		
	}
	//Activates when there is a change in the comboBox and changes the title to the new value
	public void itemStateChanged(ItemEvent e) 
    { 
        if (e.getSource() == comboBox) { 
  
        	MarkBookTitle.setText((String) comboBox.getSelectedItem()); 
        } 
    } 
}
