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
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			
	};
	public static String[] locations = {
		" ", "Item#", "Status"
	};
	public static String[] calsses = {
			"Gym Equipment", "Science Equipment"
		};
	public static void displayTable(JScrollPane SP) {
		SPMarkbook = SP;
		createTable(SP, marks, locations);
		
	}
	
	public static void calculateMark(String[][] marks) {
		int total = 0;
		for(int i = 0; i < marks.length; i++) {
			for(int j = 1; j < locations.length -1; j++) {
				total += Integer.parseInt(marks[i][j]);
			}
			marks[i][locations.length -1] = Integer.toString(total/(locations.length - 2));
			total = 0;
		}
	}

	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void createTable(JScrollPane scrollPane, String[][] coloums, String[] rows) {
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		calculateMark(marks);
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
