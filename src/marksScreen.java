import java.awt.Font;

import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class marksScreen {

	static JTable table;
	static JScrollPane SPMarkbook;
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
	public static String[] assignments = {
		" ", "Assignment1", "Assignment1","Assignment1", "Assignment1", "Assignment1", "Calculated Marks"
	};
	public static String[] calsses = {
			"ICS4U0", "SCH4U0", "MHF4U0"
		};
	public static void displayTable(JScrollPane SP) {
		SPMarkbook = SP;
		createTable(SP, marks, assignments);
		
	}
	
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

	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void createTable(JScrollPane scrollPane, String[][] coloums, String[] rows) {
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		
		calculateMark(marks);
		table.setModel(new DefaultTableModel(
				coloums, rows
		));

		
		table.getColumnModel().getColumn(1).setMinWidth(32);
		Font f = new Font("Arial", Font.BOLD, 25);
	    JTableHeader header = table.getTableHeader();
	    header.setFont(f);
		for(int i = 0; i < table.getRowCount(); i++) {
			table.setRowHeight(i, 30);
		}
		for(int i = 0; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setPreferredWidth(300);
		}
		
		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setViewportView(table);
		
	}
	public static String checkComboBoxCange(JComboBox cb, JLabel lbl) {
		return (String) cb.getSelectedItem();
	}

}