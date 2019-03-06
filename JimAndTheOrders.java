import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the jimOrders function below.
    static int[] jimOrders(int[][] orders) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for(int i=0;i<orders.length;i++){
            hm.put(i+1,orders[i][0]+orders[i][1]);
        }

        Set<Map.Entry<Integer, Integer>> set = hm.entrySet();
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(set);
        
        Collections.sort( list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare( Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2 ){
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        int[] ans = new int[list.size()];
        int k = 0;
        for(Map.Entry<Integer,Integer> entry : list){
            ans[k] = entry.getKey();
            k++;
        }

        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] orders = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] ordersRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int ordersItem = Integer.parseInt(ordersRowItems[j]);
                orders[i][j] = ordersItem;
            }
        }

        int[] result = jimOrders(orders);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
