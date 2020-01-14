import java.awt.*;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

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

public class Inventory implements TableModelListener, ItemListener{

	public JFrame frame;
	JScrollPane SPMarkbook = new JScrollPane();
	JComboBox comboBox = new JComboBox();
	JLabel lblNewLabel_1 = new JLabel("");
	private final JButton btnNewRow = new JButton("New Row");

	public Inventory() {
		initialize();
	}

	private void initialize() {
		btnNewRow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InventoryTable.inventoryData = resizeArray.addOneRow(InventoryTable.inventoryData);
				InventoryTable.createTable(InventoryTable.SPMarkbook, InventoryTable.inventoryData, InventoryTable.headers);
				InventoryTable.writeFile();
			}
		});
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Tree.background"));
		frame.setBounds(100,100,1000,500);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		lblNewLabel_1.setText(InventoryTable.headers[0]);
		
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
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
				.addGroup(gl_classXMarkbook.createSequentialGroup()
					.addComponent(SPMarkbook, GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_classXMarkbook.setVerticalGroup(
			gl_classXMarkbook.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_classXMarkbook.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(SPMarkbook, GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 9));
		
		comboBox.setModel(new DefaultComboBoxModel(InventoryTable.inventoryCatagory));
		SimpleTableDemo1(comboBox);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 501, GroupLayout.PREFERRED_SIZE)
					.addGap(216)
					.addComponent(btnNewRow, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
					.addGap(40)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnNewRow)
					.addGap(26))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(24)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(18, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
					.addGap(19)
					.addComponent(lblNewLabel_1)
					.addContainerGap(17, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		InventoryTable.displayTable(SPMarkbook);
		classXMarkbook.setLayout(gl_classXMarkbook);
		Border emptyBorder = BorderFactory.createEmptyBorder();
		InventoryTable.createTable(InventoryTable.SPMarkbook, InventoryTable.inventoryData, InventoryTable.headers);
	    SimpleTableDemo(InventoryTable.table);
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

	     Arrays.deepToString(InventoryTable.inventoryData);
	     InventoryTable.inventoryData[row][column] = (String) data;
	     InventoryTable.createTable(InventoryTable.SPMarkbook, InventoryTable.inventoryData, InventoryTable.headers);
	     SimpleTableDemo(InventoryTable.table);
	     fileWrite.writeData(InventoryTable.inventoryData, InventoryTable.headers);
		
	}
	
	public void itemStateChanged(ItemEvent e) { 
        if (e.getSource() == comboBox) { 
        	lblNewLabel_1.setText((String) comboBox.getSelectedItem()); 
        	if(comboBox.getSelectedItem() == "Gym Inventory"){
        		InventoryTable.createTable(InventoryTable.SPMarkbook, InventoryTable.gymInv, InventoryTable.headers);
       	     	SimpleTableDemo(InventoryTable.table);
        	}
        	if(comboBox.getSelectedItem() == "Science Inventory"){
        		InventoryTable.createTable(InventoryTable.SPMarkbook, InventoryTable.sncInv, InventoryTable.headers);
       	     	SimpleTableDemo(InventoryTable.table);
        	}
        	if(comboBox.getSelectedItem() == "ChromeBook Inventory"){
        		InventoryTable.createTable(InventoryTable.SPMarkbook, InventoryTable.cbInv, InventoryTable.headers);
       	     	SimpleTableDemo(InventoryTable.table);
        	}
        	
        } 
    } 
}
