import java.awt.Font;

import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class marksTable {

	static JTable table;
	static JScrollPane SPMarkbook;
	//Sample layout for the marks 2d array, which includes student names + their marks
	static String[][] marks = {																 
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},				
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},		
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			{"A", "70", "50", "50", "50", "50", "0", "0", "0", "0", "0", "0"},
			
	};
	//Sample layout for the headers, which includes user inputed assignments
	public static String[] assignments = {
		" ", "Assignment1", "Assignment1","Assignment1", "Assignment1", "Assignment1", "Calculated Marks"
	};	
	//Sample layout for the combobox, which includes user inputed classes
	public static String[] calsses = {																		
			"ICS4U0", "SCH4U0", "MHF4U0"																	
	};
	//Method to add all data to the table
	public static void displayTable(JScrollPane SP) {
		SPMarkbook = SP;
		createTable(SP, marks, assignments);
		
	}
	/* Calculate marks method takes in the String array marks
	 * goes through each individual student marks and calculates
	 * the marks based on the number of assignments.
	 */
	public static void calculateMark(String[][] marks) {
		int total = 0;
		for(int i = 0; i < marks.length; i++) {
			for(int j = 1; j < assignments.length -1; j++) {
				total += Integer.parseInt(marks[i][j]);
			}
			marks[i][assignments.length -1] = Integer.toString(total/(assignments.length - 2));
			total = 0;
		}
	}

	
	/* This method creates a table using the data from coloums (Student Names + Marks) and rows (Headers)
	 * Also sets fonts for text inside the table
	 * Finally, adds the table to the given scrollPane parameter
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
}
