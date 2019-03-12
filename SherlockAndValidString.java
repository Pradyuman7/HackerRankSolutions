import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {
    final String GOOD = "YES";
    final String BAD = "NO";

    if(s.isEmpty()) return BAD;
    if(s.length() <= 3) return GOOD;

    int[] letters = new int[26];
    for(int i = 0; i < s.length(); i++){
        letters[s.charAt(i) - 'a']++;
    }
    
    Arrays.sort(letters);
    int i=0;
    while(letters[i]==0){
        i++;
    }
    
    int min = letters[i];   
    int max = letters[25]; 
    String ret = BAD;
    
    if(min == max) 
      ret = GOOD;
    
    else{
        if(((max - min == 1) && (max > letters[24])) ||
            (min == 1) && (letters[i+1] == max))
            ret = GOOD;
    }
    return ret;
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
