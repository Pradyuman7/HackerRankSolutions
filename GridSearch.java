import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gridSearch function below.
    static String gridSearch(String[] G, String[] P) {
        int R=0;
        int C=0;
        int Rlength=G.length;
        int Plength=P.length;
        int r=0;
        int c=0;
        while(R < Rlength && Rlength - R >= P.length){
            while(C < G[0].length()){
                String substr = G[R].substring(C,C+P[r].length());
                if(substr.equals(P[r])){
                    int count=1;
                    r++;
                    while(r < Plength){
                        String innersubstr = G[R+r].substring(C,C+P[r].length());
                        if(innersubstr.equals(P[r])){
                                count++;
                        }
                        else{
                            r = 0;
                            count = 0;
                            break;
                        }
                            r++;
                    }
                    if(count == P.length){
                        return "YES";
                    }
                }
                else{
                    r = 0;
                    c = 0;
                }
                C++;
                if(C > G[0].length() - P[0].length()){
                    R++;
                    C = 0;
                    break;
                }   
            }

        }
         return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] RC = scanner.nextLine().split(" ");

            int R = Integer.parseInt(RC[0]);

            int C = Integer.parseInt(RC[1]);

            String[] G = new String[R];

            for (int i = 0; i < R; i++) {
                String GItem = scanner.nextLine();
                G[i] = GItem;
            }

            String[] rc = scanner.nextLine().split(" ");

            int r = Integer.parseInt(rc[0]);

            int c = Integer.parseInt(rc[1]);

            String[] P = new String[r];

            for (int i = 0; i < r; i++) {
                String PItem = scanner.nextLine();
                P[i] = PItem;
            }

            String result = gridSearch(G, P);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
