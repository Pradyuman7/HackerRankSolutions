import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gridChallenge function below.
    static String gridChallenge(String[] grid) {

        int len = grid[0].length();

        for(int i=0;i<grid.length;i++){
            char[] arr = grid[i].toCharArray();
            Arrays.sort(arr);
            grid[i] = new String(arr);
        }

        char[] a = new char[grid.length];

        for(int j=0;j<len;j++){
            for(int i=0;i<grid.length;i++){
                a[i] = grid[i].charAt(j);
            }
            if(!isInOrder(a))
                return "NO";
        }

        return "YES";
    }

    static boolean isInOrder(char[] arr) {
        char previous = '\u0000';
        for (char current : arr) {
            if (current < previous)
                return false;
            previous = current;
        }
        return true;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String[] grid = new String[n];

            for (int i = 0; i < n; i++) {
                String gridItem = scanner.nextLine();
                grid[i] = gridItem;
            }

            String result = gridChallenge(grid);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
