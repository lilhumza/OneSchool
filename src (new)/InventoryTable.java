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

	static String[][] marks = {
			{"Beaker", "1234", "Alot", "InStock"},
			{"Ball", "4321", "Alot", "InStock"},
			{"STUFF", "#####", "Alot", "InStock"},
			
	};
	public static String[] locations = {
		" ", "Item#", "Quantity", "Status"
	};
	public static String[] calsses = {
			"Gym Inventory", "Science Inventory", "ChromeBook Inventory"
		};
	public static void displayTable(JScrollPane SP) {
		SPMarkbook = SP;
		createTable(SP, marks, locations);
		
	}


	
	/**
	 * @wbp.parser.entryPoint
	 */
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
	public static String checkComboBoxCange(JComboBox cb, JLabel lbl) {
		return (String) cb.getSelectedItem();
	}

}
