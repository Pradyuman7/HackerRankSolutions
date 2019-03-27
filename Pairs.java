import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {
        int count = 0;

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int find = num + k;
            if(binarySearch(arr,find))
                count++;
        }
        return count;
    }

    static boolean binarySearch(int[] arr, int find){
        return binarySearch(arr,0,arr.length-1,find);
    }

    static boolean binarySearch(int[] arr, int start, int end, int find){
        int mid = (start+end)/2;

        if(end < start)
            return false;

        if(find == arr[mid])
            return true;

        if(find < arr[mid]){
            return binarySearch(arr,start,mid-1,find);
        }    

        if(find > arr[mid]){
            return binarySearch(arr,mid+1,end,find);
        }

        return false;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = pairs(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
