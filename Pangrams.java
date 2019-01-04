import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the pangrams function below.
    static String pangrams(String s) {
        String all = "abcdefghijklmnopqrstuvwxyz";
        String test = "";
        for(int i = 0; i < s.length(); i++){
            test = (""+s.charAt(i)).toLowerCase();
            if(all.contains(test)){
                all = all.replace(test,"");
                
                if(all.isEmpty())
                    return "pangram";
                
            }
        }
        
        return "not pangram";
    }    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
