import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class writeDataToFile {
	
	public static void writeArraylistS(ArrayList<String> data, String file) throws Exception{
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		for(int i = 0; i < data.size(); i++){
			writer.write(data.get(i));
		}
	    writer.close();
	}
	public static void writeArraylistI(ArrayList<Integer> data, String file)throws Exception{
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		for(int i = 0; i < data.size(); i++){
			writer.write(data.get(i));
		}
	    writer.close();
	}
	public static void arrayS(String[] data, String file)throws Exception{
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		for(int i = 0; i < data.length; i++){
			writer.write(data[i]);
		}
	    writer.close();
	}
	public static void arrayI(int[] data, String file)throws Exception{
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		for(int i = 0; i < data.length; i++){
			writer.write(data[i]);
		}
	    writer.close();
	}
}
