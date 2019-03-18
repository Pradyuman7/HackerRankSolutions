import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        ArrayList<Integer> imp = new ArrayList<Integer>();
        ArrayList<Integer> nImp = new ArrayList<Integer>();
        ArrayList<Integer> all = new ArrayList<Integer>();
        int sum = 0;

        for(int i=0;i<contests.length;i++){
            if(contests[i][1] == 1)
                imp.add(contests[i][0]);
            else
                nImp.add(contests[i][0]);

            all.add(contests[i][0]);    
        }

        Collections.sort(imp);
        Collections.sort(nImp);

        int n = imp.size() - 1;
        for(int i=n;i>n-k;i--){
            sum += imp.get(i);
            //System.out.print("+ "+imp.get(i));
        }

        /*for(int i=0;i<imp.size();i++){
            System.out.println(imp.get(i));
        }*/

        for(int i=0;i<nImp.size();i++){
            sum += nImp.get(i);
            //System.out.print("+ "+nImp.get(i));
        }

        for(int i=0;i<=n-k;i++){
            sum -= imp.get(i);
            //System.out.print("- "+imp.get(i));
        }

        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

