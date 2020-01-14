import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class resizeArray {
	
	static String[][] inventoryData = {
			{"Beaker", "1234", "Alot", "InStock"},
			{"Ball", "4321", "Alot", "InStock"},
			{"STUFF", "#####", "Alot", "InStock"},
			
	};

	public static String[] addOneColoum(String[] array){
		String[] s = new String[array.length+1];

	    for(int i = 0; i < array.length; i++){
	    	if(i == array.length){
	    		s[i] = " ";
	    	}
	    	else{
	    		s[i] = array[i];
	    	}
	    }	
	    InventoryTable.writeFile();
		return s;
	}
	public static String[][] addOneRow(String[][] array){
		String[][] s = new String[array.length+1][array[0].length];

	    for(int i = 0; i < array.length+1; i++){
	    	for(int j = 0; j < array[0].length; j++){
	    		if(i == array.length){
	    			s[i][j] = " ";
	    		}
	    		else{
	    			s[i][j] = array[i][j];
	    		}
	    	}
	    }	
	    InventoryTable.writeFile();
		return s;
		
	}
}
