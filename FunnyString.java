import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the funnyString function below.
    static String funnyString(String s) {
        char[] arr = s.toCharArray();
        int flag = 1;

        int start = 0, end = arr.length-1;

        while(start < (arr.length-2)){

            int first = (int) arr[start];
            int last = (int) arr[end];
            int sec = (int) arr[start+1];
            int secLast=(int) arr[end-1];

            if(Math.abs(first-sec)!=Math.abs(last-secLast))
                flag = 0;

            start++;
            end--;
        }

        if(flag == 1)
            return "Funny";
        else
            return "Not Funny";    

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
