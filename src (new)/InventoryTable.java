import java.awt.Font;
import java.util.Arrays;

import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class InventoryTable {

	static JTable table;
	static JScrollPane SPMarkbook;
	//Sample layout for the items inside the inventory table
	static String[][] inventoryData = {
			{"Beaker", "1234", "Alot", "InStock"},
			{"Ball", "4321", "Alot", "InStock"},
			{"STUFF", "#####", "Alot", "InStock"},
			
	};
	static String[][] gymInv = {
			{"Ball", "1234", "Alot", "InStock"},
			{"Ball", "4321", "Alot", "InStock"},
			{"Ball", "#####", "Alot", "InStock"},
			
	};
	static String[][] sncInv = {
			{"Beaker", "1234", "Alot", "InStock"},
			{"Beaker", "4321", "Alot", "InStock"},
			{"Beaker", "#####", "Alot", "InStock"},
			
	};
	static String[][] cbInv = {
			{"CB", "2", "1", "InStock"},
			{"CB", "3", "1", "Out"},
			{"CB", "#####", "1", "InStock"},
			
	};
	//Sample layout for tables's headers
	public static String[] headers = {
		" ", "Item#", "Quantity", "Status"
	};
	//Different Inventory Areas
	public static String[] inventoryCatagory = {
			"Gym Inventory", "Science Inventory", "ChromeBook Inventory"
		};
	public static void displayTable(JScrollPane SP) {
		SPMarkbook = SP;
		createTable(SP, inventoryData, headers);
	}
	//Creats the table and sets the coloum and row height and widths
	public static void createTable(JScrollPane scrollPane, String[][] coloums, String[] rows) {
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
				coloums, rows
		));

		
		table.getColumnModel().getColumn(1).setMinWidth(32);
		Font f = new Font("Arial", Font.BOLD, 15);
	    JTableHeader header = table.getTableHeader();
	    header.setFont(f);
		for(int i = 0; i < table.getRowCount(); i++) {
			table.setRowHeight(i, 20);
		}
		for(int i = 0; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setPreferredWidth(125);
		}
		
		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setViewportView(table);
		
	}
	//Detects Changes inside the comboBox and returns the new value
	public static String checkComboBoxChange(JComboBox cb, JLabel lbl) {
		return (String) cb.getSelectedItem();
	}

}
