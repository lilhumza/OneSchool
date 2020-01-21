import java.awt.Font;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class InventoryTable {
	public static DefaultTableModel tableModel = new DefaultTableModel();
	static JTable table;
	static JScrollPane SPMarkbook;
	
	//Sample layout for the items inside the inventory table
	static String[][] inventoryData = {
			{"Beaker", "1234", "56", "In Stock"},
			{"Bean Bag", "4321", "32", "In Stock"},
			{"CB - Library", "2", "1", "In Stock"},
			
	};
	static String[][] gymInv = { //Gym Inventory
			{"Baseball", "1234", "23", "In Stock"},
			{"Bean Bag", "4321", "32", "In Stock"},
			{"Hula Hoop", "#####", "7", "In Stock"},
			
	};
	static String[][] sncInv = {
			{"Beaker", "1234", "56", "In Stock"},
			{"Lab Quest", "4321", "4", "In Stock"},
			{"Collision Carts", "#####", "9", "In Stock"},
			
	};
	
	static String[][] cbInv = {
			{"CB - Library", "2", "1", "In Stock"},
			{"CB - Buisness Dept.", "3", "1", "Out"},
			{"CB - French Dept.", "1", "1", "In Stock"},
			
	};
	//Sample layout for tables's headers
	public static String[] headers = {
		" ", "Item#", "Quantity", "Status",
	};
	public static String[] Cbheaders = {
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
	//Creates the table and sets the coloum and row height and widths

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void createTable(JScrollPane scrollPane, String[][] coloums, String[] rows) {
		table = new JTable(tableModel);
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
