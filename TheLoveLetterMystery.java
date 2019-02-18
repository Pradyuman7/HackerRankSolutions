import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the theLoveLetterMystery function below.
    static int theLoveLetterMystery(String s) {
        char[] string = s.toCharArray();
        int start = 0;
        int end = s.length()-1;

        int count = 0;

        while(start < end){
            char c1 = string[start];
            char c2 = string[end];

            if(c1 != c2){
                count += findDifference(c1,c2);
            }

            start++;
            end--;
        }

        return count;
    }

    static int findDifference(char c1, char c2){
        int diff = Math.abs((int) c1 - (int) c2);
        return diff;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = theLoveLetterMystery(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
