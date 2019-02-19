import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makingAnagrams function below.
    
    static int makingAnagrams(String s1, String s2) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int count = 0;

        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);
            else
                hm.put(c,1);    
        }

        for(int i=0;i<s2.length();i++){
            char c = s2.charAt(i);
            if(hm.containsKey(c) && hm.get(c) > 0){
                count++;
                hm.put(c,hm.get(c)-1);
            }
        }

        int len1 = s1.length();
        int len2 = s2.length();
        System.out.println(count);
        int ans = len1 - count + len2 - count;

        return ans;
    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
