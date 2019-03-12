import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the checkMagazine function below.
    static String checkMagazine(String[] magazine, String[] note) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();

        for(String s : magazine){
            if(!hm.containsKey(s))
                hm.put(s,1);
            else
                hm.put(s, hm.get(s)+1);    
        }

        for(String s : note){
            if(!hm.containsKey(s) || hm.get(s) <= 0)
                return "No";
            else
                hm.put(s, hm.get(s)-1);
        }
        return "Yes";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int m = scanner.nextInt();
        int n = scanner.nextInt();  
        scanner.nextLine();

        if(n > m)
            System.out.println("No");
        else{
            String[] mag = new String[m];
            String[] note = new String[n];

            String mS = scanner.nextLine();
            String nS = scanner.nextLine();

            mag = mS.split(" ");
            note = nS.split(" ");
            
            System.out.println(checkMagazine(mag,note));
        }    

        scanner.close();
    }
}
