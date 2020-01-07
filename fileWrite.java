import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class fileWrite {
	
	
	public static void writeData (String[][] inventory, String[] head){
	    try {
	        FileWriter data = new FileWriter("InventoryDataGym.txt");
	        BufferedWriter writeData = new BufferedWriter(data);
	        int numberOfRows = inventory[0].length;

	        for (int i=0; i < inventory.length; i++){
	        	for (int j=0; j < numberOfRows; j++ ) {
	        		writeData.write(inventory[i][j] + " ");
	        	}
	        	writeData.newLine();
	        }
	        writeData.write("Flage1");
	        writeData.newLine();
	        
	        for (int i=0;i<head.length; i++){
	        	writeData.write(head[i] +" ");
	        }
	        writeData.close();
	        data.close();
	        System.out.println("Data written to file.");
	      } catch (IOException e){
	        System.out.println("Problem writing to file.");
	        System.err.println("IOException: " + e.getMessage());
	      }

	  }
	
	public static void readFile (String filename){
	    try {
	    	File file = new File(filename);
	    	 BufferedReader br = new BufferedReader(new FileReader(file)); 
	    	  ArrayList<String> s = new ArrayList<String>();
	    	  String st; 
	    	  int i = 0;
	    	  while ((st = br.readLine()) != "quit") {
	    		  System.out.println(st);
	    		  s.add(st);
	    	  }
	    	  System.out.println(s);
	      } catch (IOException e){
	        System.out.println("Problem writing to file.");
	        System.err.println("IOException: " + e.getMessage());
	      }

	  }
}
