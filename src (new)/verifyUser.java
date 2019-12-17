import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class verifyUser {
    static File file;
    static String[] data;
    public static boolean verify(String username, String password) throws IOException {
        try{
            file = new File(username + ".txt");
        }catch (Exception e){
            return false;
        }
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            data = sc.nextLine().split(" ");
        if(data[0].contentEquals(username) && data[1].contentEquals(password)){
            return true;
        }
        return false;
    }
}
