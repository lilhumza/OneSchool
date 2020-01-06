import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fileWrite {
	
	
	public static void writeData (String[][] inventory, String[] head){

	    try {
	        FileWriter data = new FileWriter("InventoryDataGym.txt");
	        BufferedWriter writeData = new BufferedWriter(data);
	        int numberOfRows = inventory[0].length;

	        for (int i=0;i<inventory.length; i++){
	        	for (int j=0; j < numberOfRows; j++ ) {
	        		writeData.write(inventory[i][j] + " ");
	        	}
	        	writeData.newLine();
	        }
	        writeData.newLine();
	        
	        for (int i=0;i<head.length; i++){
	        	writeData.write(head[i] +" ");
	        }
	        writeData.close();
	        data.close();
	        System.out.println("Data written to file.");
	      }catch (IOException e){
	        System.out.println("Problem writing to file.");
	        System.err.println("IOException: " + e.getMessage());
	      }

	  }


}
